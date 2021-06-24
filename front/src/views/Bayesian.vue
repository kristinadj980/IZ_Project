<template>
  <div>
    <span style="display:inline-block; width: 10px;"></span>
    <br/><br/>
    Select symptoms (Use ctrl or cmd to select multiple)
    
    <b-form-select
      multiple="true"
      v-bind:class="{ 'fix-height': multiple === 'true' }"
      v-model="multipleSelections" :options="symptoms"
      >
    </b-form-select>
    
    <br/>
    <br/>

    <!-- {{ multipleSelections }} -->
    <select v-model="selectedContinent">
      <option disabled value="">Select continent</option>
      <option value="north_america">north america</option>
      <option value="south_america">south america</option>
      <option>asia</option>
      <option>europe</option>
      <option>australia</option>
      <option>africa</option>
    </select>
    <span style="display:inline-block; width: 30px;"></span>

    <select v-model="selectedSkills">
      <option disabled value="">Select skills required</option>
      <option>LOW</option>
      <option>MEDIUM</option>
      <option>HIGH</option>
    </select>

    <span style="display:inline-block; width: 30px;"></span>

    <input v-model.number="numberOfEmployees" type="number">

    <span style="display:inline-block; width: 30px;"></span>

    <select v-model="selectedLikelihood">
      <option disabled value="">Select likelihood</option>
      <option>LOW</option>
      <option>MEDIUM</option>
      <option>HIGH</option>
    </select>

    <span style="display:inline-block; width: 30px;"></span>

    <select v-model="selectedSeverity">
      <option disabled value="">Select severity</option>
      <option>LOW</option>
      <option>MEDIUM</option>
      <option>HIGH</option>
    </select>
    
    <br/><br/>
    <button type="button" v-on:click="greet">Analyze data  </button>
    <br/><br/>
    <div :key="a"
        v-for="a in attackNames">
        
   
        </div>
    Possible attacks:
    <select v-model="attackName">
      <option v-for="attack in this.attackNames"  v-on:click ="addAlternativeTolist($event, attack)" v-bind:key="attack">
      {{attack}}</option> 
    </select>
    <br/><br/><br/>
    <button type="button" v-on:click="findCountermeasures">Countermeasures  </button>
    <br/><br/>
    Possible countermeasures :

    <div id="centered" style="margin: 0 auto; width:300px;text-align: left;"><ol id="example-1">
      <li v-for="item in countermeasures" :key="item">
        {{ item.name }}
      </li>
    </ol></div>
    
    

</div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'Bayesian',
  components: {
  },
  data() {
    return {
      multipleSelections: [],
      multiple: "true",
      symptoms:[
        {value : "update", text : "update"},
        {value : "suspicious_conversation_email", text: "suspicious conversation email"},
        {value : "app_download", text : "app download"},
        {value : "ad_click", text : "ad click"},
        {value : "ad_blocker_deactivation", text : "ad blocker deactivation"},
        {value : "suspicious_link", text : "suspicious link"},
        {value : "suspicious_website", text : "suspicious website"},
        {value : "pop_up_windows", text : "pop up windows"},
        {value : "credential_re_entering", text : "credential re-entering"},
        {value: "services_fail", text : "services fail"},
        {value : "credentials_theft", text : "credentials theft"},
        {value : "frequents_spams", text : "frequents spams"},
        {value : "bribery", text : "bribery"},
        {value : "virus_detection", text : "virus detection"},
        {value : "suspicious_code_modifications", text : "suspicious code modifications"},
        {value : "suspicious_conversation_visit", text : "suspicious conversation visit"},
        {value : "suspicious_conversasion_phone_call", text : "suspicious conversation phone call"},
        {value : "suspicious_conversasion_phone_message", text : "suspicious conversation phone message"}
      ],
      selectedContinent : '',
      selectedSkills : '',
      numberOfEmployees : '',
      selectedLikelihood : '',
      selectedSeverity : '',
      attackNames : ["_____________________"],
      attackName :"",
      countermeasures:[]
    }
  },
  methods: {
    greet: function () {
      axios.post(("http://localhost:8090/api/bayesian/reasoning"), {
                'symptoms': this.multipleSelections,
                'continent' :this.selectedContinent,
                'skillsRequired':this.selectedSkills,
                'numberOfEmployees': this.numberOfEmployees,
                'likelihood':this.selectedLikelihood,
                'severity':this.selectedSeverity,
            },{
                headers: {
                    'Content-Type': 'application/json',
                }
            })
            .then(res => {
                this.attackNames = res.data;
                alert("Bayesian reasoning is successful!");

            }).catch(() => {
            alert("Not successful!")
        });
    },
    findCountermeasures: function () {
      if (this.attackName === "") {
        alert("Please select attack")
        return;
      }
      axios
        .post(("http://localhost:8090/api/temp/countermeasures"), {
                'attackName': this.attackName,
            },{
                headers: {
                    'Content-Type': 'application/json',
                }
            })
            .then(res => {
                this.countermeasures = res.data
                console.log(res.data)
                alert("Successfully!");
            }).catch(() => {
            
        });
    },
  }
}

</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
