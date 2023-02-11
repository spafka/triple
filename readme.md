```bash
mvn dependency:sources -DincludeGroupIds=org.apache.dubbo
```

```json
{
    "name":"provider",
    "id":"169.254.48.63:20880",
    "address":"169.254.48.63",
    "port":20880,
    "sslPort":null,
    "payload":{
        "@class":"org.apache.dubbo.registry.zookeeper.ZookeeperInstance",
        "id":"169.254.48.63:20880",
        "name":"provider",
        "metadata":{
            "dubbo.endpoints":"[{\"port\":20880,\"protocol\":\"dubbo\"}]",
            "dubbo.metadata-service.url-params":"{\"connections\":\"1\",\"version\":\"1.0.0\",\"dubbo\":\"2.0.2\",\"release\":\"3.1.0\",\"side\":\"provider\",\"port\":\"20880\",\"protocol\":\"dubbo\"}",
            "dubbo.metadata.revision":"f82a9a864c1312de23931f28cdff177b",
            "dubbo.metadata.storage-type":"local",
            "timestamp":"1674997954786"
        }
    },
    "registrationTimeUTC":1674997956090,
    "serviceType":"DYNAMIC",
    "uriSpec":null
}
```