<template>
    <div id="main">
        <div><Navbar></Navbar></div>
        <div><jumbotron></jumbotron></div>
        <Footer></Footer>
    </div>
   
</template>


<script>
import Navbar from '@/components/Layout/Navbar.vue'
import jumbotron from '@/components/Layout/jumbotron.vue'
import Footer from '@/components/Layout/Footer.vue'
export default {
    components:{
    Navbar,jumbotron,Footer
  },
    
}
</script>

<style scoped>
     .no-margin {
    margin-top: 0 !important;
  }
</style>
