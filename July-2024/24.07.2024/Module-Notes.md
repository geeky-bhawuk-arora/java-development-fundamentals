### Folder Structure

src
    bhawuk
            abc
                xyz     
                    Hello.java
            pqr
            module-info.java
            
javac -d mods --module-source-path src/ --module bhawuk
