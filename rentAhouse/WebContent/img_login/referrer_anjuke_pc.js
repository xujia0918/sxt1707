(function(c,h){var d=document,n=c.location;if(!c.TJ58){c.TJ58=!0;null==c.String.prototype.trim&&(c.String.prototype.trim=function(){return this.replace(/^\s\s*/,"").replace(/\s\s*$/,"")});var a={curURL:n.href,referrer:d.referrer,domain:function(){var b=n.host.toLowerCase(),a=/.*?([^\.]+\.(com|org|net|biz|edu|cc)(\.[^\.]+)?)/;return a.test(b)?"."+b.replace(a,"$1"):""}(),window_size:d.documentElement.clientWidth+"x"+d.documentElement.clientHeight,setCookie:function(){if(!d.cookie)return!1;var b=new Date;
2<arguments.length?b.setTime(b.getTime()+864E5*arguments[2]):b.setTime(b.getTime()+18E5);2<=arguments.length&&(d.cookie=arguments[0]+"="+escape(arguments[1])+"; expires="+b.toGMTString()+"; domain="+a.domain+"; path=/")},getCookie:function(b){if(!d.cookie)return"";var a;return(a=d.cookie.match(RegExp("(^| )"+b+"=([^;]*)(;|$)")))?unescape(a[2]):""},ajaxsend:function(b){(new Image).src=b},setLocalStorage:function(b,a){try{c.localStorage&&c.localStorage.setItem(b,a)}catch(d){}},getLocalStorage:function(b){try{return c.localStorage?
c.localStorage.getItem(b):""}catch(a){return""}},getUUID:function(a){var k="xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx".replace(/[xy]/g,function(a){var b=16*c.Math.random()|0;return("x"==a?b:b&3|8).toString(16)}),k=this.getCookie(a)||this.getLocalStorage(a)||k;this.setCookie(a,k,365);this.setLocalStorage(a,k);return k},getRandom:function(){return c.Math.random()}},e={config:{trackLog:{server:"tracklog.58.com/anjuke_pc/empty.js.gif",allParams:"site_name tag referrer anjuke_guid cityid _ga_utma window_size trackURL rand_id".split(" "),
uniqParams:["tag","rand_id"]},clickLog:{server:"tracklog.58.com/anjuke_pc/click/empty.js.gif",allParams:"site_name tag from trackURL referrer rand".split(" "),uniqParams:["tag","from","rand"]}},getBaseInfo:function(){var b=c.site_name||"anjuke",k=c.encodeURIComponent(a.referrer),d=a.getUUID("58tj_uuid"),e=a.window_size,f=a.getCookie("als"),m=a.getCookie("aQQ_ajkguid"),l=a.getCookie("ctid"),h=a.getCookie("utm_source"),n=a.getCookie("spm"),q,p,r;""!=a.getCookie("new_session")?(q=a.getCookie("init_refer"),
p="0"):(q=c.encodeURIComponent(a.referrer),p="1");r=""!=a.getCookie("new_uv")?parseInt(a.getCookie("new_uv"))+("0"==p?0:1):1;a.setCookie("new_session",p);a.setCookie("init_refer",q);a.setCookie("new_uv",r,365);var v="1.1.1.1.1."+r;_trackURL=c._trackURL||"NA";var g=_trackURL=_trackURL.toString().replace(/\"/g,"'"),s=[],u=g.indexOf("{"),f={als:f,new_session:p,init_refer:q,new_uv:r,utm_source:h,spm:n,UUID:d},t;for(t in f)f.hasOwnProperty(t)&&s.push("'"+t+"':'"+f[t]+"'");s.join(",");g="NA"!==g&&-1!==
u?g.substring(0,u+1)+s+","+g.substring(u+1):"{"+s+"}";g=c.encodeURIComponent(g);return{site_name:b,referrer:k,UUID:d,window_size:e,_ga_utma:v,cityid:l,anjuke_guid:m,trackURL:g}},sendLog:function(b,c){var d=this.baseInfo,e=this.config[b];if(b&&e&&c&&"object"===typeof c){for(var f=[],m=e.allParams,l=0,h=m.length;l<h;l++)f.push(m[l]+"="+(c[m[l]]||d[m[l]]||""));a.ajaxsend(n.protocol+"//"+e.server+"?"+f.join("&"))}},trackLog:function(){this.sendLog("trackLog",{tag:"pvstatall",rand_id:a.getRandom()})},
clickLog:function(b){var c="",c=null!=b&&"from="===b.substring(0,5)?b.replace("from=",""):"default&"+b;this.sendLog("clickLog",{tag:"pvsiters",from:c,rand:a.getRandom()})},bindAlsTag:function(){if(!a.getCookie("als")&&h&&"function"===typeof h("body").one)h("body").one("mouseover",function(){a.setCookie("als","0",365)});a.getCookie("isSpider")&&a.setCookie("isSpider","",0)}};e.baseInfo=e.getBaseInfo();e.trackLog();e.bindAlsTag();c.clickLog=function(a){e.clickLog(a)}}})(window,window.jQuery);