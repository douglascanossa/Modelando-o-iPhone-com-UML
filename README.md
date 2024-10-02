## UML iPhone
@startuml
package "Interfaces" {
    interface ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(musica: String)
    }

    interface AparelhoTelefonico {
        +ligar(numero: String)
        +atender(numero: String)
    }

    interface NavegadorInternet {
        +exibirPagina(url: String)
        +adicionarNovaAba()
        +atualizarPagina()
    }
}

package Aparelho {
    class iPhone {
        -model: String
        -storage: int
        +iPhone(model: String, storage: int)
        +getModelo(): String
        +getArmazenamento(): int
        +tocar()
        +pausar()
        +selecionarMusica(musica: String)
        +ligar(numero: String)
        +atender(numero: String)
        +exibirPagina(url: String)
        +adicionarNovaAba()
        +atualizarPagina()
    }
    iPhone ..|> ReprodutorMusical
    iPhone ..|> AparelhoTelefonico
    iPhone ..|> NavegadorInternet
}

class usuario {
    +main(args: String[])
}

@enduml





