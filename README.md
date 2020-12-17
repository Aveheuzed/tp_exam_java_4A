# TP examen : API et outils de développement en Java

[![Maintainability](https://api.codeclimate.com/v1/badges/551b96d5f7ee8defc545/maintainability)](https://codeclimate.com/github/Aveheuzed/tp_exam_java_4A/maintainability)
<a href="https://codeclimate.com/github/Aveheuzed/tp_exam_java_4A/test_coverage"><img src="https://api.codeclimate.com/v1/badges/551b96d5f7ee8defc545/test_coverage" /></a>

![capture CodeClimate](https://raw.githubusercontent.com/Aveheuzed/tp_exam_java_4A/master/Screenshot_1.png)

* Eclipse fonctionnant difficilement sur les PC de l'école, ce projet a été réalisé avec Notepad++. C'est un projet Java brut (Maven n'a pas été testé, j'ai essayé de l'initialiser, c'est tout)
* lien gitHub : https://github.com/Aveheuzed/tp_exam_java_4A

* j'ai pas fait les bonus pasque Maven il marche pas ... 😢
* notez que tout ce TP a été fait en console (`javac`, `git`, j'ai même essayé `mvn` !)

```bat
D:\Users\e174692\exam java\npp>git commit -m "Added a CodeClimate screenshot"
[master 51af03e] Added a CodeClimate screenshot
 Committer: Alexis MASSON <e174692@ensimlan.univ-lemans.fr>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly:

    git config --global user.name "Your Name"
    git config --global user.email you@example.com

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 Screenshot_1.png

D:\Users\e174692\exam java\npp>git push
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 29.78 KiB | 14.89 MiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/Aveheuzed/tp_exam_java_4A.git
   62b6fa5..51af03e  master -> master

D:\Users\e174692\exam java\npp>git commit -a --amend
[master 538cfee] Added a CodeClimate screenshot
 Date: Thu Dec 17 15:45:12 2020 +0100
 Committer: Alexis MASSON <e174692@ensimlan.univ-lemans.fr>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly:

    git config --global user.name "Your Name"
    git config --global user.email you@example.com

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 2 files changed, 2 insertions(+)
 create mode 100644 Screenshot_1.png

D:\Users\e174692\exam java\npp>
```

```bat
D:\Users\e174692\exam java\npp>..\..\maven\bin\mvn.cmd clean
[INFO] Scanning for projects...
[INFO]
[INFO] ----------------------< com.mycompany.app:my-app >----------------------
[INFO] Building my-app 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/2.5/maven-clean-plugin-2.5.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  21.597 s
[INFO] Finished at: 2020-12-17T15:32:30+01:00
[INFO] ------------------------------------------------------------------------
[ERROR] Plugin org.apache.maven.plugins:maven-clean-plugin:2.5 or one of its dependencies could not be resolved: Failed to read artifact descriptor for org.apache.maven.plugins:maven-clean-plugin:jar:2.5: Could not transfer artifact org.apache.maven.plugins:maven-clean-plugin:pom:2.5 from/to central (https://repo.maven.apache.org/maven2): Transfer failed for https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/2.5/maven-clean-plugin-2.5.pom: Connect to repo.maven.apache.org:443 [repo.maven.apache.org/151.101.120.215] failed: Connection timed out: connect -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/PluginResolutionException

D:\Users\e174692\exam java\npp>
```


```bat
D:\Users\e174692\exam java\npp>"C:\Program Files\Java\jdk1.8.0_251\bin\javac" -d bin/ src/*

D:\Users\e174692\exam java\npp>
```