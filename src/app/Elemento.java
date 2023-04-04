package app;

    class Elemento
    {
        public Carta meuDado;
        public Elemento proximo;

        /**
         *  Cria um elemento que guarda uma carta e aponta o próximo para nulo
         * @param carta A carta de baralho a ser guardada.
         */
        public Elemento(Carta carta){
            this.meuDado = carta;
            this.proximo = null;
        }
    }

