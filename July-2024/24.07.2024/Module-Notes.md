## Folder Structure

### Before Compiling
```
src/
    bhawuk/
            abc/
                xyz/
                    Hello.java
            pqr/
            module-info.java

javac -d mods --module-source-path src/ --module bhawuk 
```

### After Compiling

```
mods/
    bhawuk/
            abc/
                xyz/
                    Hello.class
            pqr/

java --module-path mods/ --module bhawuk/abc.xyz.java ```
```


