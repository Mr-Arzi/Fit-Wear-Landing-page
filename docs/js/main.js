// Scrollspy simple para resaltar la sección activa en el navbar
const links = [...document.querySelectorAll('.navbar a')];
const ids = links.map(a => document.querySelector(a.getAttribute('href')));
const obs = new IntersectionObserver((entries) => {
  entries.forEach(e => {
    const idx = ids.indexOf(e.target);
    if (idx >= 0) {
      if (e.isIntersecting) {
        links.forEach(l=>l.classList.remove('active'));
        links[idx].classList.add('active');
      }
    }
  });
}, {rootMargin: '-40% 0px -55% 0px', threshold: 0});
ids.forEach(el => el && obs.observe(el));
