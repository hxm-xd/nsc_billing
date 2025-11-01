document.addEventListener('DOMContentLoaded', () => {
    const header = document.querySelector('header');

    window.addEventListener('scroll', () => {
        if(window.scrollY > 600){
            header.classList.add('h-after');
        }else{
            header.classList.remove('h-after');
        }
    })
})

