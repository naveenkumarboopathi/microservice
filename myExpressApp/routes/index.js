
var express = require('express');
var router = express.Router();

//var Eureka  = express.Eureka

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });
});

router.get("/url", (req, res, next) => {
  console.log("Naveen");
  res.send("Hello World")
 });

 router.get("/info", (req,res) =>{
   console.log("Naveen");
   res.send("Connection Mode only")
 })

 const Eureka = require('eureka-js-client').Eureka;

const eureka = new Eureka({
  instance: {
    app: 'node-microservice',
    instanceId: 'nodemicroservice',
    hostName: 'localhost',
    ipAddr: '127.0.0.1',
    port:  {
        '$': 3001,
        '@enabled': 'true',
    },
    vipAddress: 'nodemicroservice',
    statusPageUrl: 'http://localhost:3001/info',
    dataCenterInfo:  {
        '@class': 'com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo',
        name: 'MyOwn',
    },
    registerWithEureka: true,
    fetchRegistry: true
},
  eureka: {
    host: 'localhost',
    port: 8090,
    servicePath: '/eureka/apps/'
  },
  registerWithEureka: true,
  fetchRegistry: true
});
eureka.logger.level('debug');
eureka.start(function(error){
  console.log(error || 'complete');
});


module.exports = router;
