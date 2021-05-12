<template>
  <div>
    <!-- <h1>Hello world</h1> -->
    Select symptoms (Use ctrl or cmd to select multiple)
    
    <select
      multiple="true"
      v-bind:class="{ 'fix-height': multiple === 'true' }"
      v-model="multipleSelections"
      >
      <option
        v-for="asset in assets"
        :value="asset">
        {{asset}}
      </option>
    </select>

    <br/>
    <br/>

    <!-- {{ multipleSelections }} -->
    <select v-model="selectedContinent">
      <option disabled value="">Select continent</option>
      <option>North America</option>
      <option>South America</option>
      <option>Asia</option>
      <option>Europe</option>
      <option>Australia</option>
      <option>Africa</option>
    </select>
    <span style="display:inline-block; width: 30px;"></span>

    <select v-model="selectedSkills">
      <option disabled value="">Select skills required</option>
      <option>Low</option>
      <option>Medium</option>
      <option>High</option>
    </select>

    <span style="display:inline-block; width: 30px;"></span>

    <select v-model="selectedPrerequisites">
      <option disabled value="">Select prerequisites</option>
      <option>none</option>
      <option>allow iFrames</option>
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

    <select v-model="selectedEmployeeNumber">
      <option disabled value="">Select number of company employees</option>
      <option>1-250</option>
      <option>250-500</option>
      <option>500-1000</option>
      <option>1000+</option>
    </select>

    <span style="display:inline-block; width: 30px;"></span>

    <select v-model="selectedCompanySector">
      <option disabled value="">Select company sector</option>
      <option>Technology</option>
      <option>finance</option>
      <option>business-and-professional-service</option>
      <option>hospital</option>
      <option>retail-and-manifacturing</option>
      <option>logistics-and-transportation</option>
    </select>

    <span style="display:inline-block; width: 30px;"></span>

    <select v-model="selectedLikelihood">
      <option disabled value="">Select likelihood</option>
      <option>Low</option>
      <option>Medium</option>
      <option>High</option>
    </select>

    <span style="display:inline-block; width: 30px;"></span>

    <select v-model="selectedSeverity">
      <option disabled value="">Select severity</option>
      <option>Low</option>
      <option>Medium</option>
      <option>High</option>
    </select>
    
    <br/><br/>
    <button type="button" v-on:click="greet">Analyze data  </button>
    <br/><br/>
    Your attack is : {{attackName}}
    <br/><br/><br/>
    Possible countermeasures :

    <div id="centered" style="margin: 0 auto; width:300px;text-align: left;"><ol id="example-1">
      <li v-for="item in countermeasures" :key="item">
        {{ item }}
      </li>
    </ol></div>
    

</div>
</template>

<script>


export default {
  name: 'App',
  components: {
  },
  data() {
    return {
      multipleSelections: [],
      data: null,
      multiple: "true",
      assets:["update", "suspicious-conversation-email", "app-download", "ad-click", "ad-blocker-deactivation", "suspicious-link", "suspicious-website", "pop-up-windows", "credential-re-entering", "services-fail", "credentials-theft", "frequents-spams", "bribery", "virus-detection"],
      selected : '',
      selectedContinent : '',
      selectedPrerequisites : '',
      selectedSkills : '',
      attackDate : '',
      selectedEmployeeNumber : '',
      selectedCompanySector : '',
      selectedLikelihood : '',
      selectedSeverity : '',
      attackName : "spear phishing",
      countermeasures : ["only-click-on-familiar-links","employee-education","antivirus"]

    }
  },
  methods: {
    greet: function (event) {
      alert("Hi");
    }
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
