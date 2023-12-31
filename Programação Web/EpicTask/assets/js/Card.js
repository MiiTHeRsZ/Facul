const cores = {
    analise: '#F06',
    teste: '#0F9',
    bd: '#F90',
    ux: '#FF00E6'
}

function Card(tarefa) {
    let card = document.createElement("div")
    card.classList.add("card")

    let h2 = document.createElement("h2")
    h2.textContent = tarefa.titulo

    let span = document.createElement("span")
    span.textContent = tarefa.pontos + " pontos"

    let meter = document.createElement("meter")
    meter.value = tarefa.pontos
    meter.min = 0
    meter.max = 100

    let botaoFinalizar = document.createElement("button")
    botaoFinalizar.classList.add("botao")
    botaoFinalizar.textContent = "Finalizar"
    botaoFinalizar.addEventListener('click', () => {
        botaoFinalizar.disabled = true
        botaoApagar.disabled = true
        pontos += Number(tarefa.pontos)
        document.querySelector(".pontos").innerHTML = pontos
    })

    let botaoApagar = document.createElement("button")
    botaoApagar.classList.add("botao")
    botaoApagar.textContent = "Apagar"
    botaoApagar.addEventListener('click', () => {
        card.style.animation = "slideout 2s ease-in-out"
        setTimeout(() => card.remove(), 1000)
    })

    /* switch (tarefa.categoria) {
        case "analise":
            card.style.borderTop = "1px solid " + cores.analise
            break;
        case "teste":
            card.style.borderTop = "1px solid " + cores.teste
            break;
        case "bd":
            card.style.borderTop = "1px solid " + cores.bd
            break;
        case "ux":
            card.style.borderTop = "1px solid " + cores.ux
            break;
    } */

    card.style.borderTop = "1px solid " + cores[tarefa.categoria]

    card.appendChild(h2)
    card.appendChild(span)
    card.appendChild(meter)
    card.appendChild(botaoFinalizar)
    card.appendChild(botaoApagar)

    return card
}