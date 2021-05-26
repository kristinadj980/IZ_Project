<template>
  <div>
    <h1>Vulnerability calculator</h1>
    
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
    Calculated risk is : {{riskNumber}}%
    

</div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'Fuzzy',
  components: {
  },
  data() {
    return {
      selectedContinent : '',
      selectedSkills : '',
      numberOfEmployees : '',
      selectedCompanySector : '',
      selectedLikelihood : '',
      selectedSeverity : '',
      riskNumber : '' 

    }
  },
  methods: {
    greet: function (event) {
      if (this.selectedContinent == null || this.selectedSkills == null || this.numberOfEmployees == null
      || this.selectedCompanySector == null || this.selectedLikelihood == null || this.selectedSeverity == null) {
        alert("Please enter all values.");
        return;
      }
      axios
        .post(("http://localhost:8090/api/fuzzy/calculator"), {
                'continent' :this.selectedContinent,
                'skillsRequired':this.selectedSkills,
                'numberOfEmployees': this.numberOfEmployees,
                'companySector':this.selectedCompanySector,
                'likelihood':this.selectedLikelihood,
                'severity':this.selectedSeverity,
            },{
                headers: {
                    'Content-Type': 'application/json',
                }
            })
            .then(res => {
                this.riskNumber = res.data

            }).catch(() => {
            alert("Pharmacy was not registered successfully!")
        });
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


	// severity : REAL;
	// likelihood : REAL;
	// company_size : REAL;
	// continent : REAL;
	// skills_required : REAL;
	// company_sector : REAL;