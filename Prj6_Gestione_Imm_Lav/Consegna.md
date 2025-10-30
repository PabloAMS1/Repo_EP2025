# Gestione Immaginazione e Lavoro
Crea un programma per gestire l'inserimento di aule, studenti e corsi.
Hai a disposizione 2 file DB: CorsiDB.csv e StudentiDB.csv

Prepara una maschera di inserimento (menu da console) dove l'utente può scegliere se inserire un nuovo corso oppure un nuovo studente, scegliere se mostrare tutti i corsi o tutti gli studenti, scegliere di inserire un nuovo corso o un nuovo studente. 

Strutturas dei Model:
- Corso (titolo, codice, numPartecipanti)
- Studente (nome, cognome, codFiscale, corsoIscritto)

Struttura dei Controller (ogni Controller deve scrivere separatamente nel DB di destinazione)
- CorsoController
- StudentiController