<template>
    <div id="attacks">
        <b-card class="card_look" >
            <b-row v-for="(attack, index) in attacks" v-bind:key="index"  style="background: #f5f1f4;" >
                <b-col
                sm="4" 
                align-self="center"
                    ><strong
                        ><h3 
                        class ="text-justify top-buffer" 
                        align="center" 
                        style="margin-left:50px; margin-top:15px;"
                        >{{attack.companyName}} 
                        </h3>
                    </strong>
                </b-col>
                
                <b-col sm="4" align-self="center">
                    <b-button variant="outline-danger" @click="selectedAttack = attack;"  style="margin-top:5px;margin-left:120px;" size="lg" class = " mb-2 btn btn-lg " v-b-modal.modal-1>
                        Overview
                    </b-button>
                </b-col>
                <hr>
            </b-row>
        </b-card>
        <b-modal ref="modal-ref1" id="modal-1" title="Attack" hide-footer>
            <div>
                <h5 class ="text-justify top-buffer"> Attack name: 
                    <b-form-input v-model="selectedAttack.attackName" label="First Name" filled placeholder="Enter your name"></b-form-input>
                </h5>
                <h5 class ="text-justify top-buffer"> Company name: 
                    <b-form-input v-model="selectedAttack.companyName" label="First Name" filled placeholder="Enter your name"></b-form-input>
                </h5>
                <b-dropdown text="Symptoms" class="m-md-2">
                    <b-dropdown-item> {{selectedAttack.symptom1}}</b-dropdown-item>
                    <b-dropdown-item> {{selectedAttack.symptom2}}</b-dropdown-item>
                    <b-dropdown-item> {{selectedAttack.symptom3}}</b-dropdown-item>
                </b-dropdown>
                <h5 class ="text-justify top-buffer"> Continent: 
                    <b-form-input v-model="selectedAttack.continent" label="First Name" filled placeholder="Enter your name"></b-form-input>
                </h5>
                <h5 class ="text-justify top-buffer"> Prerequisites: 
                    <b-form-input v-model="selectedAttack.prerequisites" label="First Name" filled placeholder="Enter your name"></b-form-input>
                </h5>
                <h5 class ="text-justify top-buffer"> Selected Attack: 
                    <b-form-input v-model="selectedAttack.skillsRequired" label="First Name" filled placeholder="Enter your name"></b-form-input>
                </h5>
                <h5 class ="text-justify top-buffer"> Likelihood: 
                    <b-form-input v-model="selectedAttack.likelihood" label="First Name" filled placeholder="Enter your name"></b-form-input>
                </h5>
                <h5 class ="text-justify top-buffer">  Date:
                    <b-form-input v-model="selectedAttack.date" label="First Name" filled placeholder="Enter your name"></b-form-input>
                </h5>
                <h5 class ="text-justify top-buffer"> Number Of employees: 
                    <b-form-input v-model="selectedAttack.numberOfEmployees" label="First Name" filled placeholder="Enter your name"></b-form-input>
                </h5>
                <h5 class ="text-justify top-buffer">  Company sector:
                    <b-form-input v-model="selectedAttack.companySector" label="First Name" filled placeholder="Enter your name"></b-form-input>
                </h5>
                <h5 class ="text-justify top-buffer">  Severity:
                    <b-form-input v-model="selectedAttack.severity" label="First Name" filled placeholder="Enter your name"></b-form-input>
                </h5>
                <b-button style="margin-left: 240px; margin-top: 40px;"
                pill variant="outline-danger" 
                class = "btn btn-lg space_style" 
                v-on:click = "updateAttack"> 
                    Update changes
                </b-button>
            </div>
        </b-modal>
    </div>
</template>

<script>
export default {
  name: 'Attacks',
  components: {
  },
  data() {
    return {
    
    attacks: [],
    selectedAttack:"",

    }
  },
  mounted() {
     this.axios.get('http://localhost:8090/api/rdf/getAttacks')
     .then(response => {
              this.attacks = response.data;
         }).catch(res => {
               alert(Error)
                console.log(res);
    });
  },

  methods: {
      updateAttack: function(){
          
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
.card_look{
    width: 30%;
    margin-left: 680px;
    margin-top: 5px;
    margin-right: 50px;
}
</style>