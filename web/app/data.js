var states = [
        { name: 'base', state: { abstract: true, url: '', templateUrl: 'views/base.html', data: {text: "Base", visible: false } } },
        { name: 'login', state: { url: '/login', parent: 'base', templateUrl: 'views/login.html', controller: 'LoginCtrl', data: {text: "Login", visible: false } } },
        { name: 'dashboard', state: { url: '/dashboard', parent: 'base', templateUrl: 'views/dashboard.html', controller: 'DashboardCtrl', data: {text: "Dashboard", visible: false } } },
        { name: 'overview', state: { url: '/overview', parent: 'dashboard', templateUrl: 'views/dashboard/overview.html', data: {text: "Overview", visible: true } } },
        { name: 'reports', state: { url: '/reports', parent: 'dashboard', templateUrl: 'views/dashboard/reports.html', data: {text: "Reports", visible: true } } },
        { name: 'logout', state: { url: '/login', data: {text: "Logout", visible: true }} }
    ];
var navigation = [
        {
                name:"About",
                url: "#about",
                isActive: false
        },
        {
                name:"Donors",
                url: "#picture-modals",
                isActive: false,
                dropdown: [
                        
                                {
                                        name:"What is it about",
                                        url:"intro",
                                        isActive: false
                                },
                                {
                                        name:"Our mission & vision",
                                        url:"mission",
                                        isActive: false
                                },
                                {
                                        name:"Who we are",
                                        url:"teamAbout",
                                        isActive: false
                                }
                        
                                
                ]
        },
        {
                name:"Receipers",
                url: "#receiper",
                isActive: false
        },
        {
                name:"FAQ",
                url: "#faq",
                isActive: false
        },
        {
                name:"Contact",
                url: "#contact",
                isActive: false
        }
];
var donor_profile = [
        {
                
        }
];
var data = [{
		id: "portfolioModal1",
		img: "img/portfolio/cabin.png",
		title: "Project Title",
		text: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit...'
	},
	{
		id: "portfolioModal2",
		img: "img/portfolio/cake.png",
		title: "Project Title",
		text: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit.'
	},
	{
		id: "portfolioModal3",
		img: "img/portfolio/circus.png",
		title: "Project Title",
		text: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. '
	},
	{
		id: "portfolioModal4",
		img: "img/portfolio/game.png",
		title: "Project Title",
		text: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. '
	},
	{
		id: "portfolioModal5",
		img: "img/portfolio/safe.png",
		title: "Project Title",
		text: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. '
	},
	{
		id: "portfolioModal6",
		img: "img/portfolio/submarine.png",
		title: "Project Title",
		text: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. '
	}

];
var service = [
	{
		icon: "fa-shopping-cart",
		heading: "Something 1",
		text: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Minima maxime quam architecto quo inventore harum ex magni, dicta impedit."
	},
	{
		icon: "fa-laptop",
		heading: "Something 2",
		text: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Minima maxime quam architecto quo inventore harum ex magni, dicta impedit."
	},
	{
		icon: "fa-lock",
		heading: "Something 3",
		text: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Minima maxime quam architecto quo inventore harum ex magni, dicta impedit."
	}
];

var ourTeam = [
        {
                name: "Veronika Romashkina",
                position: "somebody",
                img: "vr.jpg"
        },
        {
                name: "Vusala Hasanli",
                position: "somebody",
                img: "vr.jpg"
        },
        {
                name: "Reyhan Aliyeva",
                position: "somebody",
                img: "vr.jpg"
        }
];

var steps = [
        {
                img: "1.jpg",
                name: "Step 1",
                text: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sunt ut voluptatum eius sapiente, totam reiciendis temporibus qui quibusdam, recusandae sit vero unde, sed, incidunt et ea quo dolore laudantium consectetur!"
        },
        {
                img: "1.jpg",
                name: "Step 2",
                text: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sunt ut voluptatum eius sapiente, totam reiciendis temporibus qui quibusdam, recusandae sit vero unde, sed, incidunt et ea quo dolore laudantium consectetur!"
        },
        {
                img: "1.jpg",
                name: "Step 3",
                text: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sunt ut voluptatum eius sapiente, totam reiciendis temporibus qui quibusdam, recusandae sit vero unde, sed, incidunt et ea quo dolore laudantium consectetur!"
        },
        {
                img: "1.jpg",
                name: "Step 4",
                text: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sunt ut voluptatum eius sapiente, totam reiciendis temporibus qui quibusdam, recusandae sit vero unde, sed, incidunt et ea quo dolore laudantium consectetur!"
        },
        {
                img: "1.jpg",
                name: "Step 5",
                text: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sunt ut voluptatum eius sapiente, totam reiciendis temporibus qui quibusdam, recusandae sit vero unde, sed, incidunt et ea quo dolore laudantium consectetur!"
        },
        {
                img: "1.jpg",
                name: "Step 6",
                text: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sunt ut voluptatum eius sapiente, totam reiciendis temporibus qui quibusdam, recusandae sit vero unde, sed, incidunt et ea quo dolore laudantium consectetur!"
        }
];

var slinks = [
        {
                name: "facebook",
                url: "#"
        },
        {
                name: "google-plus",
                url: "#"
        },
        {
                name: "twitter",
                url: "#"
        },
        {
                name: "linkedin",
                url: "#"
        },
        {
                name: "dribbble",
                url: "#"
        }
]