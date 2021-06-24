<template>
    <div id="attacks">
      <br/><br/>
        <b-card class="card_look" >
            <b-row v-for="(attack, index) in attacks" v-bind:key="index"  style="background: #f5f1f4;" >
                <b-col
                sm="5" 
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
                
                <b-col sm="2" align-self="center">
                    <b-button variant="outline-danger" @click="selectedAttack = attack;"  style="margin-top:5px;margin-left:20px;" size="lg" class = " mb-2 btn btn-lg " v-b-modal.modal-1>
                        Update
                    </b-button>
                </b-col>
                <b-col sm="2" align-self="center">
                    <b-button variant="outline-danger" v-on:click="deletAttack(attack)" style="margin-top:5px;margin-left:40px;" size="lg" class = " mb-2 btn btn-lg ">
                        Delete
                    </b-button>
                </b-col>
                <hr>
            </b-row>
        </b-card>
        <b-modal ref="modal-ref1" size="lg"  id="modal-1" title="Attack" class="attack_update" hide-footer style="width: 500%;
    margin-left: 68px;
    margin-right: 50px;">
            <div>
                <b-row style="margin-top:5px;">
                    <b-col sm="4" align-self="center">
                        <h5 class ="text-justify top-buffer"> Attack name: </h5>
                    </b-col>
                    <b-col sm="2" align-self="center">
                        <b-form-input disabled style="width: 300px" v-model="selectedAttack.attackName" label="First Name" filled placeholder="Enter your name"></b-form-input>
                    </b-col>
                </b-row>
                <b-row style="margin-top:5px;">
                    <b-col sm="4" align-self="center">
                        <h5 class ="text-justify top-buffer"> Company name:  </h5>
                    </b-col>
                    <b-col sm="2" align-self="center">
                        <b-form-input v-model="selectedAttack.companyName" label="First Name" filled placeholder="Enter your name"></b-form-input>
                    </b-col>
                </b-row>
                <b-row style="margin-top:5px;">
                    <b-col sm="4" align-self="center">
                        <h5 class ="text-justify top-buffer"> Symptoms:  </h5>
                    </b-col>
                    <b-col sm="2" align-self="center">
                        <b-dropdown text="Symptoms" class="m-md-2" style="left:-9.5px;">
                            <b-dropdown-item > {{selectedAttack.symptom1}}</b-dropdown-item>
                            <b-dropdown-item> {{selectedAttack.symptom2}}</b-dropdown-item>
                            <b-dropdown-item> {{selectedAttack.symptom3}}</b-dropdown-item>
                        </b-dropdown>
                    </b-col>
                </b-row>
                <b-row style="margin-top:5px;">
                    <b-col sm="4" align-self="center">
                        <h5 class ="text-justify top-buffer"> Continent:  </h5>
                    </b-col>
                    <b-col sm="2" align-self="center">
                        <b-form-select v-model="selectedAttack.continent" :options="continentOptions"></b-form-select>
                    </b-col>
                </b-row>
                <b-row style="margin-top:5px;">
                    <b-col sm="4" align-self="center">
                        <h5 class ="text-justify top-buffer"> Prerequisites:  </h5>
                    </b-col>
                    <b-col sm="2" align-self="center">
                        <b-form-select v-model="selectedAttack.prerequisites" :options="prerequisitesOptions"></b-form-select>
                    </b-col>
                </b-row>
                <b-row style="margin-top:5px;">
                    <b-col sm="4" align-self="center">
                        <h5 class ="text-justify top-buffer"> Skills Required:  </h5>
                    </b-col>
                    <b-col sm="2" align-self="center">
                        <b-form-select style="width:135px;" v-model="selectedAttack.skillsRequired" :options="options"></b-form-select>
                    </b-col>
                </b-row>
                <b-row style="margin-top:5px;">
                    <b-col sm="4" align-self="center">
                        <h5 class ="text-justify top-buffer"> Likelihood  </h5>
                    </b-col>
                    <b-col sm="2" align-self="center">
                        <b-form-select  style="width:135px;" v-model="selectedAttack.likelihood" :options="options"></b-form-select>
                    </b-col>
                </b-row>
                <b-row style="margin-top:5px;">
                    <b-col sm="4" align-self="center">
                        <h5 class ="text-justify top-buffer"> Date:  </h5>
                    </b-col>
                    <b-col sm="2" align-self="center">
                        <b-form-input v-model="selectedAttack.date" filled placeholder="Enter date"></b-form-input>
                    </b-col>
                  <b-col sm="2" align-self="center">
                    YYYY-MM-DD
                  </b-col>
                </b-row>
                <b-row style="margin-top:5px;">
                    <b-col sm="4" align-self="center">
                        <h5 class ="text-justify top-buffer"> Number Of employees:   </h5>
                    </b-col>
                    <b-col sm="2" align-self="center">
                        <b-form-input type="number" v-model="selectedAttack.numberOfEmployees" filled placeholder="Enter number Of employees"></b-form-input>
                    </b-col>
                </b-row>
                <b-row style="margin-top:5px;">
                    <b-col sm="4" align-self="center">
                        <h5 class ="text-justify top-buffer"> Company sector:  </h5>
                    </b-col>
                    <b-col sm="2" align-self="center">
                         <b-form-select v-model="selectedAttack.companySector" :options="companySectorOptions"></b-form-select>
                    </b-col>
                </b-row>
                <b-row style="margin-top:5px;">
                    <b-col sm="4" align-self="center">
                        <h5 class ="text-justify top-buffer"> Severity:   </h5>
                    </b-col>
                    <b-col sm="2" align-self="center">
                         <b-form-select style="width:135px;" v-model="selectedAttack.severity" :options="options"></b-form-select>
                    </b-col>
                </b-row>
                <b-button style="margin-left: 40px; margin-top: 40px; width:300px;"
                 variant="outline-danger" 
                class = "btn btn-lg space_style" 
                v-on:click = "close"> 
                    Close
                </b-button>
                <b-button style="margin-left: 40px; margin-top: 40px; width:300px;"
                 variant="outline-danger" 
                class = "btn btn-lg space_style" 
                v-on:click = "updateAttack(selectedAttack)"> 
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
        options: [
          { value: 'LOW', text: 'LOW' },
          { value: 'MEDIUM', text: 'MEDIUM' },
          { value: 'HIGH', text: 'HIGH' },
        ],
        companySectorOptions: [
          { value: 'hospital', text: 'Hospital' },
          { value: 'finance', text: 'Finance' },
          { value: 'technology', text: 'Technology' },
          { value: 'retail_and_manufacturing', text: 'Retail and manufacturing' },
          { value: 'business_and_professional_service', text: 'Business and professional service' },
          { value: 'logistics_and_transportation', text: 'Logistics and transportation' },
        ],
        continentOptions: [
          { value: 'asia', text: 'Asia' },
          { value: 'europe', text: 'Europe' },
          { value: 'north_america', text: 'North America' },
          { value: 'south_america', text: 'South America' },
          { value: 'australia', text: 'Australia' },
          { value: 'africa', text: 'Africa' },
        ],
        prerequisitesOptions: [
          { value: 'none', text: 'None' },
          { value: 'allow_iFrames', text: 'Allow iFrames' },
          { value: 'knowledge_about_update_processes', text: 'Knowledge about update processes' },
          { value: 'access_to_the_target_system', text: 'Access to the target system' },
          { value: 'knowledge_about_deployed_system', text: 'Knowledge about deployed system' },
          { value: 'knowledge_of_popular_domains', text: 'Knowledge of popular domains' },
          { value: 'knowledge_of_how_to_communicate_with_the_target', text: 'Knowledge of how to communicate with the target' },
          { value: 'knowledge_of_and_access_to_network_route', text: 'Knowledge of and access to network route' },
          { value: 'knowledge_about_update_processes', text: 'Knowledge about update processes' },
          { value: 'target_software_is_utilizing_application_framework_APIs', text: 'Target software is utilizing application framework APIs' },
          { value: 'vulnerable_DNS', text: 'Vulnerable DNS' },
          { value: 'mobile_phone_number_of_victim', text: 'Mobile phone number of victim' },
          { value: 'support_invisible_flash', text: 'Support invisible flash' },
          { value: 'previously_installed_malicious_application_on_android_device', text: 'Previously installed malicious application on android device' },
          { value: 'previously_installed_malicious_application', text: 'Previously installed malicious application' },
          { value: 'sim_card_that_relies_on_des_cipher', text: 'Sim card that relies on des cipher' },
        ],
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
        close: function() {
            this.$refs['modal-ref1'].hide();
        },
        updateAttack: function(attack){
          if (this.selectedAttack.numberOfEmployees < 0) {
            alert("Number of employees cannot be negative.")
            return;
          }
            this.axios.post("http://localhost:8090/api/rdf/update",attack,{
                }).then(res => {
                    this.selectedAttack = res.data;
                    alert("Attack update is successful!");
                    this.$refs['modal-ref1'].hide();
                }).catch(() => {
                alert("Not successful!")
            });
          
        },

        deletAttack: function(attack) {
            this.axios.post("http://localhost:8090/api/rdf/delete",attack,{
            }).then(res => {
                    this.attacks = res.data;
                    alert("Attack is deleted successfully!");

                }).catch(() => {
                alert("Not successful!")
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
.card_look{
    width: 30%;
    margin-left: 680px;
    margin-top: 5px;
    margin-right: 50px;
}

.attack_update{
    width: 50%;
    margin-left: 68px;
    margin-right: 50px;
}

</style>