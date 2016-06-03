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
		icon: "fa-child",
		heading: "Something 1",
		text: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Minima maxime quam architecto quo inventore harum ex magni, dicta impedit."
	},
	{
		icon: "fa-heart",
		heading: "Something 2",
		text: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Minima maxime quam architecto quo inventore harum ex magni, dicta impedit."
	},
	{
		icon: "fa-gift",
		heading: "Something 3",
		text: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Minima maxime quam architecto quo inventore harum ex magni, dicta impedit."
	}
];

var ourTeam = [
        {
                name: "Veronika Romashkina",
                position: "Project idea/Front-end/Backend",
                img: "vr.jpg"
        },
        {
                name: "Vusala Hasanli",
                position: "Back-end",
                img: "vr.jpg"
        },
        {
                name: "Reyhan Aliyeva",
                position: "Back-end",
                img: "vr.jpg"
        }
];

var steps = [
        {
                img: "step1.jpg",
                name: "Register",
                text: "Create your profile via E-mail or using your Facebook account. It won't take long, we promise"
        },
        {
                img: "step2.jpg",
                name: "Fill in",
                text: "Fill in all neccecary  fields of information<br/>Important: Be honest! This is somebody's life we want to safe, so take time to answer all questions"
        },
        {
                img: "step3.jpg",
                name: "Keep Eyes on",
                text: "Announcements! You WILL be notified about your potential recipients, but you also can share other to help people."
        },
        {
                img: "step4.jpg",
                name: "Request",
                text: "Found the recipent you want to help to? Don't be shy. You can request just in one click. Then all you can do wait for approvement and announcement status change"
        },
        {
                img: "step5.jpg",
                name: "Donation",
                text: "After successful virtuality application call you can ACT in real life. All neccesary data will be provided. Your calendar refreshed, your destination point is hostipal. Go through standaart donation procedure. "
        },
        {
                img: "step6.jpg",
                name: "Reward",
                text: "Nice job! You are somebody's hero now! Grab your rating points and feedback from recipient, so you have more chances to be accepted. Share this bravery aact with your friends. Ask them also to join"
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