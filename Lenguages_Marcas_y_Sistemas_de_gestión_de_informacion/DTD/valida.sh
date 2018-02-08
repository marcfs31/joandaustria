#! /bin/bash
# Aquest guió realitza comprovacions bàsiques de l'exercici
# IMPORTANT: No cal entendre aquest codi per poder realitzar correctament l'exercici
# La superació de les validacions bàsiques NO implica que l'exercici estigui bé. En canvi, la no
# superació implica que l'exercici presenta un o més problemes.
validfiles=docvalid??.xml
nonvalidfiles=docinvalid??.xml
dtd=editors.dtd
hi_ha_error=0

for f in $validfiles; do
  xmllint --dtdvalid $dtd $f &> /dev/null
  if [[ "$?" != 0 ]]; then hi_ha_error=1; break; fi
done

for f in $nonvalidfiles; do
  xmllint --dtdvalid $dtd $f &> /dev/null
  if [[ "$?" == 0 ]]; then hi_ha_error=1; break; fi
done

if [[ "$hi_ha_error" == 0 ]];
then
  echo "Validacions bàsiques superades. Considera lliurar el fitxer $dtd"
else
  echo "Aquest lliurament no passa una o més comprovacions. Revisa els requeriments."
fi
