<template>
  <div>
    <b-tabs content-class="mt-3">
      <b-tab title="Cbr reasoning" active>
    Enter company name
    <span style="display:inline-block; width: 10px;"></span>
    <input type="text" v-model="companyName"/>
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

    <select v-model="selectedPrerequisites">
      <option disabled value="">Select prerequisite</option>
      <option>none</option>
      <option>allow_iFrames</option>
      <option>knowledge_about_update_processes</option>
      <option>access_to_the_target_system</option>
      <option>knowledge_about_deployed_system</option>
      <option>knowledge_of_popular_domains</option>
      <option>knowledge_of_how_to_communicate_with_the_target</option>
      <option>knowledge_of_and_access_to_network_route</option>
      <option>target_software_is_utilizing_application_framework_APIs</option>
      <option>vulnerable_DNS</option>
      <option>mobile_phone_number_of_victim</option>
      <option>support_invisible_flash</option>
      <option>previously_installed_malicious_application_on_android_device</option>
      <option>previously_installed_malicious_application</option>
      <option>sim-card-that-relies-on-des-cipher</option>
    </select>

    <span style="display:inline-block; width: 30px;"></span>

    <input type="date" v-model="attackDate" max="2021-07-01"/>

    <span style="display:inline-block; width: 30px;"></span>

    <!-- <select v-model="selectedEmployeeNumber">
      <option disabled value="">Select number of company employees</option>
      <option>1-250</option>
      <option>250-500</option>
      <option>500-1000</option>
      <option>1000+</option>
    </select> -->

    <input v-model.number="numberOfEmployees" type="number">

    <span style="display:inline-block; width: 30px;"></span>

    <select v-model="selectedCompanySector">
      <option disabled value="">Select company sector</option>
      <option>technology</option>
      <option>finance</option>
      <option>business_and_professional_service</option>
      <option>hospital</option>
      <option>retail_and_manufacturing</option>
      <option>logistics_and_transportation</option>
    </select>

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
    <button type="button" v-on:click="sendToAnalysis">Analyze data  </button>
    <br/><br/>
    Similar attacks are :
    <ol id="example-2">
      <li v-for="attack in cbrResult" :key="attack">
        {{ attack}}<br/>
        <b>Evaluation: </b>{{attack.evaluation}}
        <br/><br/><br/>
      </li>
    </ol>
    <br/>
    <select v-model="selectAttackForCountermeasure">
      <option v-for="attackName in this.possibleAttacks" v-bind:key="attackName" >
        {{attackName}}</option>
    </select>
    <span style="margin-left: 30px"></span><button type="button" v-on:click="registerAttack">Register attack</button>

    <br/><br/>

    <button type="button" v-on:click="findCountermeasures">Countermeasures  </button>
    <br/><br/>
    Possible countermeasures :

    <div id="centered" style="margin: 0 auto; width:300px;text-align: left;">
      <ol id="example-1">
        <li v-for="item in countermeasures" :key="item">
          {{ item.name }}
        </li>
    </ol>

    </div>
      </b-tab>
      <b-tab title="Cbr cases">
        <b-table hover :items="cbrCases"></b-table>


      </b-tab>
    </b-tabs>

</div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'Cbr',
  components: {
  },
  data() {
    return {
      multipleSelections: [],
      companyName : "",
      multiple: "true",
       symptoms:["update", "suspicious_conversation_email", "app_download", "ad_click", "ad_blocker_deactivation",
       "suspicious_link", "suspicious_website", "pop_up_windows", "credential_re_entering", "services_fail",
       "credentials_theft", "frequents_spams", "bribery", "virus_detection", "suspicious_code_modifications",
       "suspicious_conversation_visit", "suspicious_conversasion_phone_call","suspicious_conversasion_phone_message"],
      selectedContinent : '',
      selectedPrerequisites : '',
      selectedSkills : '',
      attackDate : '',
      numberOfEmployees : '',
      selectedCompanySector : '',
      selectedLikelihood : '',
      selectedSeverity : '',
      attackName : "_______________",
      countermeasures : [],
      cbrResult : [],
      possibleAttacks : [],
      selectAttackForCountermeasure : "",
      cbrCases : [],

    }
  },
  mounted() {
    this.getCbrCases();
  },
  methods: {
    sendToAnalysis: function () {
      if (this.companyName === "" || this.multipleSelections.length === 0 || this.selectedContinent === "" || this.selectedPrerequisites === "" || this.selectedSkills === ""
      || this.attackDate === "" || this.selectedCompanySector === "" || this.selectedLikelihood === "" ||  this.selectedSeverity === "" || this.numberOfEmployees === "") {
        alert("Please fill in all fields!");
        return;
      }
      axios
        .post(("http://localhost:8090/api/temp/cbr"), {
                'symptoms': this.multipleSelections,
                'continent' :this.selectedContinent,
                'prerequisites' : this.selectedPrerequisites,
                'skillsRequired':this.selectedSkills,
                'date':this.attackDate,
                'numberOfEmployees': this.numberOfEmployees,
                'companySector':this.selectedCompanySector,
                'likelihood':this.selectedLikelihood,
                'severity':this.selectedSeverity,
                'companyName' : this.companyName
            },{
                headers: {
                    'Content-Type': 'application/json',
                }
            })
            .then(res => {
              this.cbrResult = [];
              this.possibleAttacks = [];
              this.cbrResult = res.data;
              this.cbrResult.forEach((cbrResult) => {
                this.possibleAttacks.push(cbrResult.attack.name)
              })

            }).catch(() => {
            alert("CBR not successful!")
        });
    },
    getCbrCases : function () {
      this.axios.get('http://localhost:8090/api/rdf/getAttacks-cbr')
          .then(response => {
            this.cbrCases = response.data;
          }).catch(res => {
        alert(Error)
        console.log(res);
      });
    },
    findCountermeasures: function () {
      if (this.selectAttackForCountermeasure === "") {
        alert("Please select attack")
        return;
      }
      axios
        .post(("http://localhost:8090/api/temp/countermeasures"), {
                'attackName': this.selectAttackForCountermeasure,
            },{
                headers: {
                    'Content-Type': 'application/json',
                }
            })
            .then(res => {
                this.countermeasures = res.data
                console.log(res.data)
                //alert("Successfully!");
            }).catch(() => {
              alert("Countermeasures retrieval fail!")
        });
    },
    registerAttack: function () {
      if (this.selectAttackForCountermeasure === "") {
        alert("Please select attack")
        return;
      }
      let symptom1 = "";
      let symptom2 = "";
      let symptom3 = "";

      if (this.multipleSelections[0] !== undefined)
        symptom1 = this.multipleSelections[0];
      if (this.multipleSelections[1] !== undefined)
        symptom2 = this.multipleSelections[0];
      if (this.multipleSelections[2] !== undefined)
        symptom3 = this.multipleSelections[0];
      axios
        .post(("http://localhost:8090/api/rdf/insert-cbr"), {
                attackName: this.selectAttackForCountermeasure,
                continent :this.selectedContinent,
                prerequisites : this.selectedPrerequisites,
                skillsRequired:this.selectedSkills,
                date:this.attackDate,
                symptom1 : symptom1,
                symptom2 : symptom2,
                symptom3 : symptom3,
                numberOfEmployees: this.numberOfEmployees,
                companySector:this.selectedCompanySector,
                likelihood:this.selectedLikelihood,
                severity:this.selectedSeverity,
                companyName : this.companyName
            },{
                headers: {
                    'Content-Type': 'application/json',
                }
            })
            .then(() => {
                alert("Successful registration!");
                this.getCbrCases();
            }).catch(() => {
              alert("Countermeasures retrieval fail!")
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
