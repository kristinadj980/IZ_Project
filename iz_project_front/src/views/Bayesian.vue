<template>
  <div>
    <span style="display:inline-block; width: 10px;"></span>
    <br/><br/>
    Select symptoms (Use ctrl or cmd to select multiple)
    
    <select
      multiple="true"
      v-bind:class="{ 'fix-height': multiple === 'true' }"
      v-model="multipleSelections"
      >
      <option :key="symptom"
        v-for="symptom in symptoms"
        :value="symptom">
        {{symptom}}
      </option>
    </select>

    <br/>
    <br/>

    <!-- {{ multipleSelections }} -->
    <select v-model="selectedContinent">
      <option disabled value="">Select continent</option>
      <option>north_america</option>
      <option>south_america</option>
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
        
    Your attack is : {{a}}
        </div>
    
    

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
      symptoms:["update", "suspicious_conversation_email", "app_download", "ad_click", "ad_blocker_deactivation",
       "suspicious_link", "suspicious_website", "pop_up_windows", "credential_re_entering", "services_fail", 
       "credentials_theft", "frequents_spams", "bribery", "virus_detection", "suspicious_code_modifications", 
       "suspicious_conversation_visit", "suspicious_conversasion_phone_call","suspicious_conversasion_phone_message"],
      selectedContinent : '',
      selectedSkills : '',
      numberOfEmployees : '',
      selectedLikelihood : '',
      selectedSeverity : '',
      attackNames : [],
      attackName :"",
    }
  },
  methods: {
    greet: function (event) {
      
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
    findCountermeasures: function (event) {
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
