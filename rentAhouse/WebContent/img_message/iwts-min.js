/*publish date:2018-03-14 16:52:58*/
!function(x,J){function F(a){for(var b;b=a.shift();){b()}}function C(){A.loading=1;var e,b="";try{e=x.navigator.plugins["Shockwave Flash"]||x.ActiveXObject,b=e.description||new e("ShockwaveFlash.ShockwaveFlash").GetVariable("$version")}catch(a){}if(b=(b.match(/\d+/g)||[0])[0],10>b){return A._available=0,void F(K)}A._available=1,x[G]=function(){var c=arguments;setTimeout(function(){N.apply(x,c)},0)};var d=setInterval(function(){J.body&&(clearInterval(d),z(),setTimeout(function(){A.inited||(A._available=0,I.length=0,F(K))},10000))},50)}function N(a,b){switch(a){case"onecall":if(!x[b]){return}x[b].apply(x,[].slice.call(arguments,2)),x[b]=null;break;case"error":A._available=A.inited=0,F(K);break;case"load":A._available=A.inited=1,K.length=0,F(I)}}function z(){var a=J.createElement("div");a.setAttribute("style","display:block;position:absolute;right:0;bottom:0;border:none;"),J.body.firstChild?J.body.insertBefore(a,J.body.firstChild):J.body.appendChild(a),a.innerHTML='<object id="'+B()+'" data="'+A.SWF_URL+'" type="application/x-shockwave-flash" width="10" height="10" style="position:absolute;right:0;bottom:0;"><param name="movie" value="'+A.SWF_URL+'" /><param name="wmode" value="transparent" /><param name="version" value="10" /><param name="allowScriptAccess" value="always" /><param name="flashvars" value="jsproxyfunction='+G+'" /></object>',A.swf=a.firstChild}function B(){return"_"+(1000000000000000000*Math.random()).toString(36).slice(0,5).toUpperCase()}function E(){}function L(b){var c,a,d=[];for(c in b){a=b[c],a&&d.push(c+"="+a)}return d.join("&")}function y(d,f){var c=J.createElement("script"),e=J.getElementsByTagName("head")[0],b=B();x[b]=function(){try{f.apply(x,arguments),e.removeChild(c)}catch(a){}x[b]=null},c.type="text/javascript",c.src=d+"&jsonp="+b,e.firstChild?e.insertBefore(c,e.firstChild):e.appendChild(c)}function q(h,f,p){var c,g,m,b={_iwt_id:p,_iwt_cid:O,_iwt_UA:h.UA};if(h.WITH_REF){try{c=x.top.document.referrer}catch(d){try{c=x.parent.document.referrer}catch(d){c=document.referrer}}b.ref=c}if(b=L(b),f&&(g=f.length)){for(;g--;){f[g]=encodeURIComponent(f[g])}b+="&p="+f}m=h.API_URL?document.location.protocol+h.API_URL:M.API_URL,y(m+b,function(a){A.set("_iwt_id",a)})}var I=[],K=[],G=B(),A={SWF_URL:"http://irs01.net/MTFlashStore.swf#",_available:1,_jpf:G,get:function(a,b){return A._sendFlashMsg(b,"jGetItem",a)},set:function(b,c,a){return A._sendFlashMsg(a,"jSetItem",b,c)},_sendFlashMsg:function(h,d,m,b){h=h||E;var g=B(),l=arguments.length,f=A.swf;x[g]=h,2==l?f[d](g):3==l?f[d](m,g):f[d](m,b,g)},initSWF:function(a,b){return A._available?A.inited?a&&setTimeout(a,0):(a&&I.push(a),b&&K.push(b),A.loading||C(),void 0):b&&b()}},k="_iwt_cid=",D=location.search.indexOf(k),O=D>-1?location.search.slice(D+k.length).split("&",1)[0]:"",M={FC:A,API_URL:"http://irs01.com/irt?",track:function(a,b){a.NO_FLS?q(a,b):A.initSWF(function(){A.get("_iwt_id",function(c){q(a,b,c)})},function(){q(a,b)})}};if(x._iwt=M,x._iwtTQ){for(var H,j=x._iwtTQ;H=j.shift();){M.track(H[0],H[1])}}}(this,document);