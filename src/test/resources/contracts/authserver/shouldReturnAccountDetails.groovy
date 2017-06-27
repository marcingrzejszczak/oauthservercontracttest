package contracts.authserver;

import org.springframework.cloud.contract.spec.Contract

Contract.make {
  request {
	method 'GET'
	url '/api/me'
	headers {
	  header('Authorization', execute('oauth()'))
	}
  }
response {
  status 200
  body("""
  {
  "authorities": [
    {
      "authority": "ROLE_USER"
    }
  ],
  "details": {
    "remoteAddress": "127.0.0.1",
    "sessionId": null,
    "tokenValue": "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJhY2NvdW50SWQiOiJmZjgwODA4MTVjZDdjYTkwMDE1Y2Q3Y2FhMzZmMDAwMiIsInVzZXJfbmFtZSI6InRlc3R1c2VyIiwic2NvcGUiOlsicmVhZCIsIndpcnRlIl0sIm9yZ2FuaXNhdGlvbiI6ImRlZmF1bHQiLCJleHAiOjE0OTgzMTIyMDAsImF1dGhvcml0aWVzIjpbIlJPTEVfVVNFUiJdLCJqdGkiOiJjNzJlNjBkMC05ZTc4LTQ1NTEtOTg4ZS1hMjIwYjljZWJjYzkiLCJjbGllbnRfaWQiOiJ0ZXN0Y2xpZW50In0.JGEwICuJddBN3UHWFIt360khnMXSFrJcmRM6X7cqze178vJiXGvSQjz9pnO-UbNhMesi353lECd-udiSYoGtSoSCIGpTnuhGOhB5LKNUpMmHC_UAPxDqAvB6v-dD8cpMI7lD3gwz_rSjYNaySLbi3ldfN8NWfJBHjUMfrfN-PTRyK-zWbjXXrOgLEO6kO8ic2dbAFeZv4dZPH3duEPvshkw8ZjfSdf0vmWEkvJNqOxdCNwQQ5IrAr_d3bEtrbbfMQPygGsxu2ijXgiQ_U_UESPZ9zw5i99ufY-MNJ-oDKZC3Xnft0Sf3fHJE_VunyecKbwL9E-xQzwer0g-ShY7UHQ",
    "tokenType": "Bearer",
    "decodedDetails": null
  },
  "authenticated": true,
  "userAuthentication": {
    "authorities": [
      {
        "authority": "ROLE_USER"
      }
    ],
    "details": null,
    "authenticated": true,
    "principal": "testuser",
    "credentials": "N/A",
    "name": "testuser"
  },
  "principal": "testuser",
  "oauth2Request": {
    "clientId": "testclient",
    "scope": [
      "read",
      "wirte"
    ],
    "requestParameters": {
      "client_id": "testclient"
    },
    "resourceIds": [
      
    ],
    "authorities": [
      
    ],
    "approved": true,
    "refresh": false,
    "redirectUri": null,
    "responseTypes": [
      
    ],
    "extensions": {
      
    },
    "refreshTokenRequest": null,
    "grantType": null
  },
  "clientOnly": false,
  "credentials": "",
  "name": "testuser"
}
  """)
 }
}