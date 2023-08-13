let pontos = 0
let tarefasStorage = JSON.parse(localStorage.getItem("tarefas")) || []
const botao = document.querySelector("#botaoAdicionar")

function carregar() {
    tarefasStorage.forEach(tarefa => {
        document.querySelector("#tarefas").appendChild(Card(tarefa))
    });
}

carregar()

botao.addEventListener('click', (e) => {
    e.preventDefault()
    let titulo = document.querySelector("#titulo").value
    let pontos = document.querySelector("#pontos").value
    let categoria = document.querySelector("#categoria").value

    const tarefa = {
        titulo,
        pontos,
        categoria
    }

    const card = Card(tarefa)

    tarefasStorage.push(tarefa)
    localStorage.setItem("tarefas", JSON.stringify(tarefasStorage))

    document.querySelector("#tarefas").appendChild(card)
})
