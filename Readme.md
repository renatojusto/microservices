# Microservices com Spring Config

### Testar o Microserviço de Configuração

GET http://localhost:8888/ligacao/native

```
{
   "name":"ligacao",
   "profiles":[
      "native"
   ],
   "label":null,
   "version":"12e50061e91ed1192dde95bc6ad3dbcfdf220c5e",
   "state":null,
   "propertySources":[
      {
         "name":"https://github.com/renatojusto/microservice-config/ligacao/ligacao.yml",
         "source":{
            "spring.datasource.password":"root",
            "spring.datasource.username":"root",
            "spring.datasource.url":"jdbc:mysql://localhost:3307/ligacao",
            "spring.jpa.hibernate.ddl-auto":"update"
         }
      }
   ]
}
```

### Testar Microserviço Ligação

POST http://localhost:8889/ligacoes

```
    {
        "cliente": "Renato" 
    }
```

GET http://localhost:8889/ligacoes
