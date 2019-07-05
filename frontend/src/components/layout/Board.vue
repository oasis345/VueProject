<template>
    <div id="main">
        <div><Navbar></Navbar></div>
        <div>
          <mdb-tbl>
            <mdb-tbl-head>
              <tr>
                <th>회원번호</th>
                <th>아이디</th>
                <th>이름</th>
                <th>이메일</th>
              </tr> 
            </mdb-tbl-head>
            <mdb-tbl-body>
              <tr v-for="item in boardlist" v-bind:key="item"  >
                <th>{{item.id}}</th>
                <th>{{item.userId}}</th>
                <td>{{item.userName}}</td>
                <td>{{item.email}}</td>
              </tr>
      
            </mdb-tbl-body>   
          </mdb-tbl>
            <div class="text-center py-4 mt-3">
                <mdb-btn color="cyan" @click="findAll" type="submit">회원조회</mdb-btn>
       
            </div>
        </div>
        <Footer></Footer>
    </div>
   
</template>


<script>
import Navbar from '@/components/Layout/Navbar.vue'
import { mdbTbl, mdbTblHead, mdbTblBody,mdbBtn } from 'mdbvue';
import Footer from '@/components/Layout/Footer.vue'
import axios from 'axios';
export default {
     name: 'BoardPage',
    components:{
    Navbar,Footer,
    mdbTbl,
    mdbTblHead,
    mdbTblBody,
    mdbBtn
  },
  data(){
    return{
      context: 'http://localhost:9000/users',
      boardlist : []
    }
  },
  methods:{
    findAll(){
      axios.get(`${this.context}`)
      .then(res=>{
        // alert(`findAll() : ${res.data[0].userName}`)
        
        this.boardlist = res.data;
      })
      .catch(e=>{
        alert('error');
      })
    },

      //this.$router.push('/Mypage')
    }
  }
    

</script>

<style scoped>
     .no-margin {
    margin-top: 34% !important;
  }
</style>
