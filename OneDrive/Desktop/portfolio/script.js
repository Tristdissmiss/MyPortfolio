document.addEventListener("DOMContentLoaded", () => {
  const enterButton = document.getElementById("enterButton");
  const landingPage = document.getElementById("landingPage");
  const header = document.querySelector("header");
  const sections = document.querySelectorAll("main section");
  const navButtons = document.querySelectorAll("nav button");


  enterButton.addEventListener("click", () => {
  landingPage.style.display = "none";
  header.classList.remove("hidden");
  document.getElementById("about").classList.remove("hidden");
  document.getElementById("about").classList.add("fade-in");
  document.getElementById("about").scrollIntoView({ behavior: "smooth" });
});


 
  navButtons.forEach((btn) => {
    btn.addEventListener("click", () => {
      const targetId = btn.dataset.section;
      sections.forEach((section) => {
        if (section.id === targetId) {
          section.classList.remove("hidden");
          section.classList.add("fade-in");
        } else {
          section.classList.add("hidden");
          section.classList.remove("fade-in");
        }
      });
    });
  });
});
