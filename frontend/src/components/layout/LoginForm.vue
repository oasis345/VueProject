<template>
    <div id="main">
        <div><Navbar></Navbar></div>
        <form>
          <p class="h4 text-center mb-4 pt-5"> LOGIN </p>
          <div class="grey-text">
            <mdb-input label="아이디" v-model="userId" icon="lock" type="text"/>
            <mdb-input label="비밀번호" v-model="password" icon="lock" type="password"/>
          </div>
          <div class="text-center"> 
            <mdb-btn color="cyan" @click="Login" type="submit">로그인</mdb-btn>
          </div>
        </form>
        <Footer></Footer>
    </div>
   
</template>


<script>
import Navbar from '@/components/Layout/Navbar.vue'
import { mdbInput, mdbBtn } from 'mdbvue';
import Footer from '@/components/Layout/Footer.vue'
import axios from 'axios';

export default {
    name: 'LoginPage',
    components:{
    Navbar,Footer,
    mdbInput,
      mdbBtn
  },
  data(){
      return{      
            context: 'http://localhost:9000/users',
            userId: '',
            password: ''
        }
},
methods:{

      Login(){
         if(this.userId && this.password != null){
          let data={
            userId: this.userId,
            password: this.password
            
          }
            let headers = {
           'Content-Type': 'application/json',
           'Authorization': 'JWT fefege..'
         }
        axios.post(`${this.context}/login`,JSON.stringify(data),{headers: headers})
        .then(res=>{
          this.$store.state.id = res.data.id
          this.$store.state.userId = res.data.userId
          //console.log(this.$store.state)
          alert('로그인성공 마이페이지로 이동합니다.')
          this.$router.push('/Mypage')
        })
        .catch(e=>{
          alert('아이디 및 비밀번호를 확인하세요')
        })
       }else{
       alert('아이디및 비밀번호를 입력하세요')
       }
      },
      
  }
}
</script>

<style scoped>
   .no-margin {
    margin-top: 27% !important;
  }
</style>
