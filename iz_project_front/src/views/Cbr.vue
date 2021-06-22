<template>
  <div>
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
      <option disabled value="">Select prerequisites</option>
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

    <input type="date" v-model="attackDate" />

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
    <button type="button" v-on:click="greet">Analyze data  </button>
    <br/><br/>
    Your attack is : {{attackName}}
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
      countermeasures : []

    }
  },
  methods: {
    greet: function (event) {
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
                alert("CBR successful!");

            }).catch(() => {
            alert("CBR not successful!")
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
