package com.example.app.validator;

//@Component
//public class UserValidator implements Validator {
////    @Autowired
////    private UserService userService;
//
//    @Override
//    public boolean supports(Class<?> aClass) {
//        return User.class.equals(aClass);
//    }
//
//    @Override
//    public void validate(Object o, Errors errors) {
//        User user = (User) o;
//
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
//        if (user.getEmail().length() < 6 || user.getEmail().length() > 32) {
//            errors.rejectValue("username", "Size.userForm.username");
//        }
////        if (userService.getEmail(user.getFirstName()) != null) {
////            errors.rejectValue("username", "Duplicate.userForm.username");
////        }
//
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
//        if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
//            errors.rejectValue("password", "Size.userForm.password");
//        }
//
////        if (!user.getPasswordConfirm().equals(user.getPassword())) {
////            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
////        }
//    }
//}
