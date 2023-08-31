# springboot-employees

* This is a springboot application that can maintain employees

## endpoints
* GET /employees
* * GET /employees/{employeeId}
* POST /employees
* PUT /employees
* Delete /employees

## Authorisation
* admin / admin -- default
* DB - noop
* * john / test123
* * mary / test123
* * susan / test123
* DB - bcrypt
* * john / test123
* * mary / test123
* * susan / test123

## Architecture
* MySQL DataBase
* Entity + Repository + Service + RestController 

