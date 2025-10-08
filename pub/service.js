app.service('myserv', function() {
          this.getServiceList = function () {
    return [];
}
this.getISEndpoint = function() { 
 return 'http://localhost:5555/';
}
this.getAPIList = function() { 
 return [];
}
this.getCreatedTime = function() { 
 return "08-10-2025 16:55:48 CEST";
}
this.getPackageInfo = function(){
 return{"packageName":"WxStateManagerTest","displayName":"State Manager Tester","status":"Development","tags":[""],"createdDate":"08-10-2025 11:59:58 CEST","version":"1.0","buildNumber":"","description":"Setups various test scenarios to test the WxStateManager package, namely\n- schedulers\n- listeners\n- triggers\netc."};
}
});
