<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
    <html>
        <body>
            <h2>My CD Collection</h2>
            <table border="1">
                <tr bgcolor="#9acd32">
                    <th>Title</th>
                    <th>Artist</th>
                    <th>Price</th>
                </tr>
                <xsl:for-each select="catalog/cd"> <!-- Muestra por cada elemento de catalog/cd -->
                <xsl:sort select="artist"/> <!-- Ordena alfabeticamente los artistas -->
                <!-- <xsl:if test="price &lt; 10"> Muestra los precios menores que 10 para mayores es &gt-->
                <!-- <xsl:for-each select="catalog/cd[artist='Bob Dylan']"> Muestra solo si el artista es Bob Dylan también se puede poner != y demás-->
                    <tr>
                        <td><xsl:value-of select="title"/></td> <!-- Muestra el titulo y el artista de cada catalog/cd tal como se le ha indicado antes -->
                        <xsl:choose>
                        <xsl:when test="price &gt; 10">
                            <td bgcolor="#ff00ff">
                                <xsl:value-of select="artist"/></td>
                            </xsl:when>
                            <xsl:otherwise>
                                <td><xsl:value-of select="artist"/></td>
                            </xsl:otherwise>
                        </xsl:choose>
                        <td><xsl:value-of select="price"/></td>
                    </tr>
                <!-- </xsl:if> -->
                </xsl:for-each>
            </table>
        </body>
    </html>
</xsl:template>

</xsl:stylesheet>
