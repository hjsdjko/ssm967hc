(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/canting/add-or-update"],{"05f4":function(n,e,t){"use strict";var a;t.d(e,"b",(function(){return r})),t.d(e,"c",(function(){return i})),t.d(e,"a",(function(){return a}));var r=function(){var n=this,e=n.$createElement;n._self._c},i=[]},"3ce2":function(n,e,t){"use strict";(function(n){t("25f8");a(t("66fd"));var e=a(t("47d1"));function a(n){return n&&n.__esModule?n:{default:n}}n(e.default)}).call(this,t("543d")["createPage"])},"47d1":function(n,e,t){"use strict";t.r(e);var a=t("05f4"),r=t("ee90");for(var i in r)"default"!==i&&function(n){t.d(e,n,(function(){return r[n]}))}(i);t("f3e0");var u,c=t("f0c5"),o=Object(c["a"])(r["default"],a["b"],a["c"],!1,null,"7eb2be34",null,!1,a["a"],u);e["default"]=o.exports},c365:function(n,e,t){},ca06:function(n,e,t){"use strict";(function(n){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0;var a=r(t("a34a"));function r(n){return n&&n.__esModule?n:{default:n}}function i(n,e,t,a,r,i,u){try{var c=n[i](u),o=c.value}catch(s){return void t(s)}c.done?e(o):Promise.resolve(o).then(a,r)}function u(n){return function(){var e=this,t=arguments;return new Promise((function(a,r){var u=n.apply(e,t);function c(n){i(u,a,r,c,o,"next",n)}function o(n){i(u,a,r,c,o,"throw",n)}c(void 0)}))}}var c=function(){Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(function(){return resolve(t("5fd3"))}.bind(null,t)).catch(t.oe)},o={data:function(){return{cross:"",ruleForm:{cantingbianhao:"",mima:"",cantingmingcheng:"",cantingtupian:"",lianxidianhua:"",cantingdizhi:"",jingyingfanwei:""},user:{},ro:{cantingbianhao:!1,mima:!1,cantingmingcheng:!1,cantingtupian:!1,lianxidianhua:!1,cantingdizhi:!1,jingyingfanwei:!1}}},components:{wPicker:c},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(e){var t=this;return u(a.default.mark((function r(){var i,u,c,o;return a.default.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return i=n.getStorageSync("nowTable"),r.next=3,t.$api.session(i);case 3:if(u=r.sent,t.user=u.data,t.ruleForm.userid=n.getStorageSync("userid"),e.refid&&(t.ruleForm.refid=e.refid,t.ruleForm.nickname=n.getStorageSync("nickname")),!e.id){r.next=13;break}return t.ruleForm.id=e.id,r.next=11,t.$api.info("canting",t.ruleForm.id);case 11:u=r.sent,t.ruleForm=u.data;case 13:if(t.cross=e.cross,!e.cross){r.next=49;break}c=n.getStorageSync("crossObj"),r.t0=a.default.keys(c);case 17:if((r.t1=r.t0()).done){r.next=49;break}if(o=r.t1.value,"cantingbianhao"!=o){r.next=23;break}return t.ruleForm.cantingbianhao=c[o],t.ro.cantingbianhao=!0,r.abrupt("continue",17);case 23:if("mima"!=o){r.next=27;break}return t.ruleForm.mima=c[o],t.ro.mima=!0,r.abrupt("continue",17);case 27:if("cantingmingcheng"!=o){r.next=31;break}return t.ruleForm.cantingmingcheng=c[o],t.ro.cantingmingcheng=!0,r.abrupt("continue",17);case 31:if("cantingtupian"!=o){r.next=35;break}return t.ruleForm.cantingtupian=c[o],t.ro.cantingtupian=!0,r.abrupt("continue",17);case 35:if("lianxidianhua"!=o){r.next=39;break}return t.ruleForm.lianxidianhua=c[o],t.ro.lianxidianhua=!0,r.abrupt("continue",17);case 39:if("cantingdizhi"!=o){r.next=43;break}return t.ruleForm.cantingdizhi=c[o],t.ro.cantingdizhi=!0,r.abrupt("continue",17);case 43:if("jingyingfanwei"!=o){r.next=47;break}return t.ruleForm.jingyingfanwei=c[o],t.ro.jingyingfanwei=!0,r.abrupt("continue",17);case 47:r.next=17;break;case 49:t.styleChange();case 50:case"end":return r.stop()}}),r)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},cantingtupianTap:function(){var n=this;this.$api.upload((function(e){n.ruleForm.cantingtupian="upload/"+e.file,n.$forceUpdate(),n.$nextTick((function(){n.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=this;return u(a.default.mark((function t(){var r,i,u,c,o,s,l,f,g,d;return a.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(e.ruleForm.cantingbianhao){t.next=3;break}return e.$utils.msg("餐厅编号不能为空"),t.abrupt("return");case 3:if(e.ruleForm.mima){t.next=6;break}return e.$utils.msg("密码不能为空"),t.abrupt("return");case 6:if(!e.ruleForm.lianxidianhua||e.$validate.isMobile(e.ruleForm.lianxidianhua)){t.next=9;break}return e.$utils.msg("联系电话应输入手机格式"),t.abrupt("return");case 9:if(!e.cross){t.next=25;break}if(c=n.getStorageSync("statusColumnName"),o=n.getStorageSync("statusColumnValue"),""==c){t.next=25;break}if(s=n.getStorageSync("crossObj"),c.startsWith("[")){t.next=21;break}for(l in s)l==c&&(s[l]=o);return f=n.getStorageSync("crossTable"),t.next=19,e.$api.update("".concat(f),s);case 19:t.next=25;break;case 21:r=Number(n.getStorageSync("userid")),i=s["id"],u=n.getStorageSync("statusColumnName"),u=u.replace(/\[/,"").replace(/\]/,"");case 25:if(!i||!r){t.next=47;break}return e.ruleForm.crossuserid=r,e.ruleForm.crossrefid=i,g={page:1,limit:10,crossuserid:r,crossrefid:i},t.next=31,e.$api.list("canting",g);case 31:if(d=t.sent,!(d.data.total>=u)){t.next=37;break}return e.$utils.msg(n.getStorageSync("tips")),t.abrupt("return",!1);case 37:if(!e.ruleForm.id){t.next=42;break}return t.next=40,e.$api.update("canting",e.ruleForm);case 40:t.next=44;break;case 42:return t.next=44,e.$api.add("canting",e.ruleForm);case 44:e.$utils.msgBack("提交成功");case 45:t.next=55;break;case 47:if(!e.ruleForm.id){t.next=52;break}return t.next=50,e.$api.update("canting",e.ruleForm);case 50:t.next=54;break;case 52:return t.next=54,e.$api.add("canting",e.ruleForm);case 54:e.$utils.msgBack("提交成功");case 55:case"end":return t.stop()}}),t)})))()},optionsChange:function(n){this.index=n.target.value},bindDateChange:function(n){this.date=n.target.value},getDate:function(n){var e=new Date,t=e.getFullYear(),a=e.getMonth()+1,r=e.getDate();return"start"===n?t-=60:"end"===n&&(t+=2),a=a>9?a:"0"+a,r=r>9?r:"0"+r,"".concat(t,"-").concat(a,"-").concat(r)},toggleTab:function(n){this.$refs[n].show()}}};e.default=o}).call(this,t("543d")["default"])},ee90:function(n,e,t){"use strict";t.r(e);var a=t("ca06"),r=t.n(a);for(var i in a)"default"!==i&&function(n){t.d(e,n,(function(){return a[n]}))}(i);e["default"]=r.a},f3e0:function(n,e,t){"use strict";var a=t("c365"),r=t.n(a);r.a}},[["3ce2","common/runtime","common/vendor"]]]);