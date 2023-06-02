package ru.kata.spring.boot_security.demo.controller;


//@Controller
//@RequestMapping("/")
//public class UserController {
//
//    private final UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping()
//    public String index(Model model) {
//        model.addAttribute("usersList", userService.getAllUsers());
//        return "index";
//    }
//
//    @GetMapping("/new")
//    public String newUser(@ModelAttribute("newUser") User user) {
//        return "new";
//    }
//
//    @PostMapping()
//    public String createUser(@ModelAttribute("newUser") User user) {
//        userService.createUser(user);
//        return "redirect:/";
//    }
//
//    @PatchMapping("/{id}/edit")
//    public String editUser(@PathVariable("id") Long id, Model model) {
//        model.addAttribute("user", userService.getUser(id));
//        return "edit";
//    }
//
//    @PatchMapping("/{id}")
//    public String updateUser(@ModelAttribute("user") User user, @PathVariable("id") Long id) {
//        userService.updateUser(id, user);
//        return "redirect:/";
//    }
//    @DeleteMapping("/{id}")
//    public String deleteUser(@PathVariable("id") Long id) {
//        userService.deleteUser(id);
//        return "redirect:/";
//    }
//
//
//}
