<template>
  <mdb-jumbotron class="mb-0 text-center">
    <mdb-card-title class="pb-2 h4"><strong>Portfolio</strong></mdb-card-title>
    <mdb-view class="my-4" src="https://mdbootstrap.com/img/Photos/Slides/img%20(29).jpg" alt="">
      <a><mdb-mask waves overlay="white-slight"/></a>
    </mdb-view>
    <h5 class="indigo-text h5 mb-5">채형국님의 portfolio 입니다.</h5>
    <p class="card-text">– 에릭 S 레이먼드(Eric S. Raymond) &nbsp;  &nbsp;"올바로 동작하지 않더라도 걱정말아라. 모든 것이 그랬다면, 넌 직업을 잃었을테니까."</p>
  </mdb-jumbotron>
</template>
<script>
  import { mdbJumbotron, mdbCardTitle, mdbView, mdbMask, mdbIcon } from 'mdbvue';
  export default {
    name: 'JumbotronPage',
    components: {
      mdbJumbotron,
      mdbCardTitle,
      mdbView,
      mdbMask,
      mdbIcon
    }
  }
</script>

<style scoped>

</style>
