## Ablauf
1. Projekt clone
   git clone https://github.com/michacim/schape-painter
2. neuen Branch erzeugen (feature-branch)
3. neuen eigen SchapeCreator erzeugen
4. Programm ausführen/Testen
5. git add und commit
6. neuen Branch verknüpfen:
* git push -u origin feature/micha_circle
* danach geht immer git push
* git status  (überprüfen, ob im github-Repository)
* evtl. weiter  arbeiten und git add und commit + push

* >>>> pullrequest github
* local branch löschen

6. git log --oneline --all --graph
## Git Kommandos
* welche branches gibt es?
  * git branch
* neuen Branch erzeugen
  * git switch -c feature/micha_circle
* Branches anzeigen
  * git branch
* zum Master Branch wechseln
  * git switch master