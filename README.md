# ContainerStatusFuse

This project is about getting the Jboss Fuse conatainer metrics over jolokia API and dumping into Database. Such that sms client can read db to send the messages to intended users. This will dump the metrics once container moved into an abnormal behaviour. We can have configuration at runtime regaring list of containers and list of intended users.
