import Vue from 'vue'
import App from './App.vue'
import router from './router.js'
import axios from './config/http.js'
import mavonEditor from 'mavon-editor'
import iView from 'iview'
import 'iview/dist/styles/iview.css'
import 'mavon-editor/dist/css/index.css'

Vue.config.productionTip = false 
Vue.prototype.$http = axios
Vue.use(iView)
Vue.use(mavonEditor)
/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
