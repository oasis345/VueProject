<template>
    <div id="main">
        <div><Navbar></Navbar></div>
        <div>

             <mdb-container>
    <section class="text-center my-5">
      <h2 class="h1-responsive font-weight-bold my-5">My Tools</h2>
      <p class="grey-text w-responsive mx-auto mb-5"> 다음과 같은 툴을 사용합니다.</p>
      <mdb-row class="d-flex justify-content-center">
        <mdb-col md="6" xl="5" class="mb-4">
          <mdb-view class="overlay rounded z-depth-2">
            <img src="https://mdbootstrap.com/img/Photos/Others/images/1.jpg" alt="sample photo" class="img-fluid"/>
            <a>
              <mdb-mask waves overlay="white-slight"/>
            </a>
          </mdb-view>
          <mdb-card-body class="pb-0">
            <a href="" class="green-text"><h5 class="font-weight-bold mt-2 mb-3"><mdb-icon icon="chart-line" class="pr-2"/>Java</h5></a>
            <h4 class="font-weight-bold mb-3">Title of the news</h4>
            <p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit cupidatat proident voluptatem quia numquam.</p>
            <mdb-btn color="success" rounded>View more</mdb-btn>
          </mdb-card-body>
        </mdb-col>
        <mdb-col md="6" xl="5" class="mb-4">
          <mdb-view class="overlay rounded z-depth-2">
            <img src="https://mdbootstrap.com/img/Photos/Others/images/15.jpg" alt="sample photo" class="img-fluid"/>
            <a>
              <mdb-mask waves overlay="white-slight"/>
            </a>
          </mdb-view>
          <mdb-card-body class="pb-0">
            <a href="" class="green-text"><h5 class="font-weight-bold mt-2 mb-3"><mdb-icon icon="chart-line" class="pr-2"/>VSC</h5></a>
            <h4 class="font-weight-bold mb-3">Title of the news</h4>
            <p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit cupidatat proident voluptatem quia numquam.</p>
            <mdb-btn color="success" rounded>View more</mdb-btn>
          </mdb-card-body>
        </mdb-col>
        <mdb-col md="6" xl="5" class="mb-4">
          <mdb-view class="overlay rounded z-depth-2">
            <img src="https://mdbootstrap.com/img/Photos/Others/images/22.jpg" alt="sample photo" class="img-fluid"/>
            <a>
              <mdb-mask waves overlay="white-slight"/>
            </a>
          </mdb-view>
          <mdb-card-body class="pb-0">
            <a href="" class="green-text"><h5 class="font-weight-bold mt-2 mb-3"><mdb-icon icon="chart-line" class="pr-2"/>Java</h5></a>
            <h4 class="font-weight-bold mb-3">Title of the news</h4>
            <p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit cupidatat proident voluptatem quia numquam.</p>
            <mdb-btn color="success" rounded>View more</mdb-btn>
          </mdb-card-body>
        </mdb-col>
        <mdb-col md="6" xl="5" class="mb-4">
          <mdb-view class="overlay rounded z-depth-2">
            <img src="https://mdbootstrap.com/img/Photos/Others/images/2.jpg" alt="sample photo" class="img-fluid"/>
            <a>
              <mdb-mask waves overlay="white-slight"/>
            </a>
          </mdb-view>
          <mdb-card-body class="pb-0">
            <a href="" class="blue-text"><h5 class="font-weight-bold mt-2 mb-3"><mdb-icon icon="eye" class="pr-2"/>React</h5></a>
            <h4 class="font-weight-bold mb-3">Title of the news</h4>
            <p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit cupidatat proident voluptatem quia numquam.</p>
            <mdb-btn color="success" rounded>View more</mdb-btn>
          </mdb-card-body>
        </mdb-col>
        <mdb-col md="6" xl="5" class="mb-4">
          <mdb-view class="overlay rounded z-depth-2">
            <img src="https://mdbootstrap.com/img/Photos/Others/images/6.jpg" alt="sample photo" class="img-fluid"/>
            <a>
              <mdb-mask waves overlay="white-slight"/>
            </a>
          </mdb-view>
          <mdb-card-body class="pb-0">
            <a href="" class="brown-text"><h5 class="font-weight-bold mt-2 mb-3"><mdb-icon icon="camera" class="pr-2"/>Java Spring boot</h5></a>
            <h4 class="font-weight-bold mb-3">Title of the news</h4>
            <p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit cupidatat proident voluptatem quia numquam.</p>
            <mdb-btn color="success" rounded>View more</mdb-btn>
          </mdb-card-body>
        </mdb-col>
        <mdb-col md="6" xl="5" class="mb-4">
          <mdb-view class="overlay rounded z-depth-2">
            <img src="https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Products/img (57).jpg" alt="sample photo" class="img-fluid"/>
            <a>
              <mdb-mask waves overlay="white-slight"/>
            </a>
          </mdb-view>
          <mdb-card-body class="pb-0">
            <a href="" class="cyan-text"><h5 class="font-weight-bold mt-2 mb-3"><mdb-icon icon="phone" class="pr-2"/>Vue.Js</h5></a>
            <h4 class="font-weight-bold mb-3">Title of the news</h4>
            <p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit cupidatat proident voluptatem quia numquam.</p>
            <mdb-btn color="success" rounded>View more</mdb-btn>
          </mdb-card-body>
          
        </mdb-col>
      </mdb-row>
    </section>
  </mdb-container>

        </div>
        <Footer></Footer>
    </div>
   
</template>


<script>
import Navbar from '@/components/Layout/Navbar.vue'
import { mdbContainer, mdbRow, mdbCol, mdbView, mdbMask, mdbCard, mdbCardBody, mdbBtn, mdbIcon } from 'mdbvue';
import Footer from '@/components/Layout/Footer.vue'
export default {
    name: 'ProjectsPage',
    components:{
    Navbar,Footer,  mdbContainer,
      mdbRow,
      mdbCol,
      mdbView,
      mdbMask,
      mdbCard,
      mdbCardBody,
      mdbBtn,
      mdbIcon
  },
    
}
</script>

<style scoped>
     .no-margin {
    margin-top: 0 !important;
  }
</style>
