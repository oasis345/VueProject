<template>
  <mdb-navbar color="indigo" dark>
    <mdb-navbar-brand href="https://mdbootstrap.com/">
      Chae
    </mdb-navbar-brand>
    <mdb-navbar-toggler>
      <mdb-navbar-nav>
        <mdb-nav-item href="/" active>홈</mdb-nav-item>
        <mdb-nav-item href="#/personal">개인이력</mdb-nav-item>
        <mdb-nav-item href="#/board">회원목록</mdb-nav-item>
        <mdb-nav-item href="#/Login">로그인</mdb-nav-item>
        <mdb-nav-item href="#/join">회원가입</mdb-nav-item>
        <!-- <mdb-nav-item href="#/Mypage">마이페이지</mdb-nav-item> -->
        <mdb-dropdown tag="li" class="nav-item">
          <!-- <mdb-dropdown-toggle tag="a" navLink color="indigo" slot="toggle" waves-fixed>로그인</mdb-dropdown-toggle> -->
          <mdb-dropdown-menu>
            <mdb-dropdown-item>회원가입</mdb-dropdown-item>
          </mdb-dropdown-menu>
        </mdb-dropdown>
      </mdb-navbar-nav>
      
    </mdb-navbar-toggler>
  </mdb-navbar>
</template>

<script>
  import { mdbNavbar, mdbNavbarBrand, mdbNavbarToggler, mdbNavbarNav, mdbNavItem, mdbDropdown, mdbDropdownMenu, mdbDropdownToggle,  mdbDropdownItem } from 'mdbvue';
  export default {
    name: 'NavbarPage',
    components: {
      mdbNavbar,
      mdbNavbarBrand,
      mdbNavbarToggler,
      mdbNavbarNav,
      mdbNavItem,
      mdbDropdown,
      mdbDropdownMenu,
      mdbDropdownToggle,
      mdbDropdownItem,
   
    }
  }
</script>

<style scoped>

</style>
