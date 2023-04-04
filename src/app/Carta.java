package app;

public class Carta {
    // '\u2663','\u2664','\u2665', '\u2666'  --> códigos hexadecimais dos caracteres dos naipes.

    public char naipe;
    public String face;     //o que aparece na carta A, 2, 3, ... J, Q, K
    public int valor;       //valor da carta (depende da regra do jogo)

/**
 * Construtor. Recebe valores numéricos e converte para os dados de uma carta
 * @param naipe 1 - Copas || 2 - Ouros || 3 - Paus || 4 - Espadas
 * @param pos De 1 a 13, (A até K), na ordem
 */
public Carta(int naipe, int pos){
    switch (naipe){
        case 1: this.naipe = '♥';
            break;
        case 2: this.naipe = '♦';
            break;
        case 3: this.naipe = '♣';
            break;
        case 4: this.naipe = '♠';
            break;
        default:
            this.naipe = '♥';
            break;
    }
    switch (pos){
        case 1: this.face = "A";
            break;
        case 2:  case 3:  case 4:   case 5:
        case 6:  case 7:  case 8:   case 9:
        case 10: this.face = Integer.toString(pos);
            break;
        case 11:
            this.face = "J";
            break;
        case 12:
            this.face = "Q";
            break;
        case 13:
            this.face = "K";
            break;
        default:
            this.face = "Q";
            break;
    }
    valor = pos;
}

/**
 * Retorna a cor de acordo com o naipe
 * @return String V ou P, de acordo com a cor
 */
public String cor(){
    switch (naipe)
    {
        case '♥':
        case '♦':
            return "V";
        case '♣':
        case '♠':
            return "P";
    }
    return "V";
}

/**
 *  Valor nominal da carta (ex: 4 de ♠)
 */
@Override
public String toString()
{
    return this.face + " de " + this.naipe;
}
}
