#####################
Embolic de tancaments
#####################
::

  Autor: Marc Fors Soler
::

  Email: cf17marc.fors@iesjoandaustria.org
::

  Data: 19/11/2017

Problemes
=========
::

  <?xml version="1.0" encoding="UTF-8"?>

  <a> A <b> AB <c> ABC </a> BC </b> C </c>

  Està ben format però prefereixo ficar-ho d'altres maneres

Proposta 1
==========
::

  <?xml version="1.0" encoding="UTF-8"?>

  <a>
    A
  <b>
    AB
  <c>
    ABC
  </a>
    BC
  </b>
    C
  </c>

Proposta 2
==========
::

  <?xml version="1.0" encoding="UTF-8"?>
  
  <a>
    A
      <b>
        AB
        <c>
          ABC
          </a>
        BC
      </b>
          C
        </c>
