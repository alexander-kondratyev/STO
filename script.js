const backToTopButton = document.getElementById('back-to-top');

// Функция показа кнопки при прокрутке вниз
window.addEventListener('scroll', function() {
    if (window.scrollY > 300) { // Показывать кнопку, если прокрутка больше 300px
        backToTopButton.style.display = 'block';
    } else {
        backToTopButton.style.display = 'none';
    }
});

// Функция плавного скролла наверх при клике на кнопку
backToTopButton.addEventListener('click', function() {
    window.scrollTo({
        top: 0,
        behavior: 'smooth'
    });
});

//Навигация по разделам сайта
document.getElementById('hrefMain').addEventListener('click', function(e) {
    e.preventDefault();
    document.querySelector('#headerwrap').scrollIntoView({
        behavior: 'smooth',
        block: 'start'
    });
});

document.getElementById('hrefOurServices').addEventListener('click', function(e) {
    e.preventDefault();
    document.querySelector('#w').scrollIntoView({
        behavior: 'smooth',
        block: 'start'
    });
});

document.getElementById('hrefOurTeam').addEventListener('click', function(e) {
    e.preventDefault();
    document.querySelector('#employeers').scrollIntoView({
        behavior: 'smooth',
        block: 'start'
    });
});

document.getElementById('hrefAboutUs').addEventListener('click', function(e) {
    e.preventDefault();
    document.querySelector('#aboutUs').scrollIntoView({
        behavior: 'smooth',
        block: 'start'
    });
});

//Функция выпадающего списка при клике на категорию услуг
function toggleServices(category) {
    const services = document.querySelectorAll('.' + category);
    services.forEach(service => {
        if (service.style.display === "table-row") {
            service.style.display = "none";
        } else {
            service.style.display = "table-row";
        }
    });
}