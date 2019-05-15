# Ah03 Android Lib

ah03 android library

Usage in android projects:

```
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```
```
dependencies {
    implementation 'com.github.caiooaugusto:ah03-android-lib:0.0.7'
}
```
1. Functions

1.1 cadastroFuncionario
params: String matricula
error:
```
{
  "error": true,
  "matricula": "matricula",
}
```
sucess:
```
{
  "error": false,
  "matricula": "matricula",
  "bio": "hash da biometria capturada",
}
``` 

1.2 batidaFuncionario 
params: none
error:
```
{
  "error": true
}
```
sucess:
```
{
  "error": false,
  "matricula": "matricula"
}
```

1.3 configura 
params: String id, String bio
error:
```
{
  "error": true,
}
```
sucess:
```
{
  "error": false
}
```
