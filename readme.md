# Organizador Estudantil

Aplicativo Android para organizar atividades acadêmicas, permitindo o cadastro de disciplinas e seus respectivos horários.

## Funcionalidades

- **Tela inicial** com navegação para cadastro de atividades
- **Cadastro de atividades** com campos para disciplina e horário
- Validação de campos obrigatórios
- Interface com Material Design

## Screenshots

| Tela Inicial | Cadastro de Atividade |
|:-:|:-:|
| Título + ícone personalizado + botão "Cadastrar Atividade" | Campos de disciplina e horário + botão "Salvar" |

## Requisitos

- Android Studio Hedgehog ou superior
- JDK 11+
- Android SDK 36 (min SDK 24 — Android 7.0+)

## Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/Organizador-Estudantil.git
   ```
2. Abra o projeto no Android Studio
3. Aguarde o Gradle sincronizar as dependências
4. Execute no emulador ou dispositivo físico (Run > Run 'app')

## Estrutura do projeto

```
app/src/main/
├── java/ava2/organizadorestudantil/
│   ├── MainActivity.java          # Tela inicial
│   └── CadastroActivity.java      # Tela de cadastro de atividade
├── res/
│   ├── layout/
│   │   ├── activity_main.xml      # Layout da tela inicial
│   │   └── activity_cadastro.xml  # Layout do cadastro
│   ├── drawable/                   # Ícones e recursos visuais
│   └── values/                     # Strings, cores e temas
└── AndroidManifest.xml
```

## Tecnologias

- **Linguagem:** Java
- **UI:** ConstraintLayout + Material Design Components
- **Build:** Gradle (Version Catalog)
- **Target SDK:** 36 | **Min SDK:** 24

## Licença

Este projeto é de uso acadêmico.

## Autor

Rodrigo Cesar Tavares Ferreira
