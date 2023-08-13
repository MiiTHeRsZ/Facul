const url = "https://api.themoviedb.org/3/trending/movie/week?api_key=1e922667481ab207d642450b0efb461e"

async function carregarFilmes() {
    let resposta = await fetch(url)
    let json = await resposta.json()

    let filmes = json.results
    filmes.forEach(filme => document.querySelector("#filmesEmAlta").innerHTML = document.querySelector("#filmesEmAlta").innerHTML + card(filme))
}

function card(filme) {
    let element = `
        <div class="card">
            <span class="material-symbols-outlined iconFav">
                favorite_border
            </span>
            <img src="https://www.themoviedb.org/t/p/w200/${filme.poster_path}" alt="minions2" />
                <p>${filme.title}</p>
                <p>⭐ ${filme.vote_avarage}</p>
                <a href="pageMinions2.html" class="button">Detalhes</a>
        </div>
    `
    return element
}

carregarFilmes()
