<template>
    <div id="main">
        <div><Navbar></Navbar></div>
        
         <!-- Card -->
        <mdb-card>
            <mdb-card-body>
            <form>
                <p class="h4 text-center py-4"> JOIN </p>
                <div class="grey-text">

                <mdb-input v-model="userId" label="아이디" icon="lock" group type="text" validate error="wrong" success="right"/>
                <mdb-input v-model="userName" label="이름" icon="lock" group type="text" validate error="wrong" success="right"/>
                <mdb-input v-model="email" label="이메일" icon="envelope" group type="email" validate error="wrong" success="right"/>
                <mdb-input v-model="password" label="비밀번호" icon="lock" group type="password" validate/>
                </div>
                <div class="text-center py-4 mt-3">
                <mdb-btn color="cyan" @click="save" type="submit">회원가입</mdb-btn>
                </div>
            </form>
            </mdb-card-body>
        </mdb-card>
        <!-- Card -->
            
        <Footer></Footer>
        
    </div>
   
</template>


<script>
import Navbar from '@/components/Layout/Navbar.vue'
import { mdbInput, mdbBtn, mdbCard, mdbCardBody } from 'mdbvue';
import Footer from '@/components/Layout/Footer.vue'
import { METHODS } from 'http';
import axios from 'axios'
export default {
    name: 'JoinPage',
    components:{
    Navbar,Footer,
     mdbInput,
      mdbBtn,
      mdbCard,
      mdbCardBody
  },
  data(){
      return{      
            context: 'http://localhost:9000/users',
            userId: 'oasis345',
            userName: '형국',
            password: '1234',
            email: '네이버'
        }
  },
  methods:{
      save(){
          let data={
              userId: this.userId,
              userName: this.userName,
              password: this.password,
              email: this.email
          }
          let headers = {
           'Content-Type': 'application/json',
           'Authorization': 'JWT fefege..'
         }
         axios.post(`${this.context}`,
                    JSON.stringify(data),
                    {headers: headers})
        .then(res=>{
            alert(`회원가입에 성공하셨습니다`)
            this.$router.push('/')
        })
        .catch(e=>{
            alert('error');
            this.$router.link(-1);
        })      
      }
  }
    
}
</script>

<style scoped>
     .no-margin {
    margin-top: 19% !important;
  }
</style>
