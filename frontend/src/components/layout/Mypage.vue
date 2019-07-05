<template>
    <div id="main">
        <div><Navbar></Navbar></div>
        
         <!-- Card -->
        <mdb-card>
            <mdb-card-body>
            <form>
                <p class="h4 text-center py-4"> 마이 페이지 </p>
                <div class="grey-text">
                
                <mdb-input v-model="userId"  label="아이디" type="text" aria-readonly="true"  />
                <mdb-input v-model="userName" label="이름"  group type="text" validate error="wrong" success="right"/>
                <mdb-input v-model="email"  label="이메일" group type="text" validate error="wrong" success="right"/>
                <mdb-input v-model="password"  label="비밀번호" group type="text" validate/>
                </div>
                <div class="text-center py-4 mt-3">
                <mdb-btn color="cyan" @click="update" type="submit">업데이트</mdb-btn>
                <mdb-btn color="cyan" @click="delete_id" type="submit">삭제</mdb-btn>
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
            userId: this.$store.state.userId
           
            
          
            
        }
  },
  methods:{
      update(){
          let data={
              id: this.$store.state.id,
              userId: this.userId,
              userName: this.userName,
              password: this.password,
              email: this.email,
          }
          let headers = {
           'Content-Type': 'application/json',
           'Authorization': 'JWT fefege..'
         }
         axios.put(`${this.context}/update`,
                    JSON.stringify(data),
                    {headers: headers})
        .then(res=>{
            alert('업데이트성공 메인으로 돌아갑니다.')
              this.$router.push('/')
        })
        .catch(e=>{
            alert('error');
        })      
      },

      delete_id(){
          axios.delete(`${this.context}/${this.id}`)
          .then(res=>{
              alert('삭제성공 이용해주셔서 감사합니다.')
              this.$router.push('/')
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
