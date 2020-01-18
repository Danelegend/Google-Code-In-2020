extern crate rand;

use rand::Rng; // 0.7.2
use std::io;

fn main() {
    let code: [u32;6] = create_code();

    //println!("{:?}", code);

    let mut amount_of_attempts = 0;
    let mut checker = false;

    while !checker {
        amount_of_attempts = amount_of_attempts + 1;
        let player_guess = player_guess(); // Suppose this works
        checker = compare_guesses(player_guess, code);
    }

    println!("Congratulations! It took you {} attempts to guess the code!", amount_of_attempts);
}

fn create_code() -> [u32; 6] {
    let mut secret_code: [u32; 6] = [0;6];
    let mut rng = rand::thread_rng();
    for i in 0..6 {
        let rand_num = rng.gen_range(0, 10);
        secret_code[i] = rand_num;
    }

    return secret_code;
}

fn compare_guesses(player_guess: [u32; 6], code: [u32;6]) -> bool {
    let mut box1: [bool; 6] = [false;6];

    let mut checker = true;
    let mut amount_true = 0;

    for i in 0..6 {
        if player_guess[i] == code[i] {
            box1[i] = true;
            amount_true = amount_true + 1;
        }
        else {
            checker = false;
        }
    }

    if checker {
        return true;
    }

    println!("You got {} in the right place!", amount_true);

    return false;
}

fn player_guess() -> [u32; 6] {
    println!("Guess the number!");
    let mut guess = String::new();

    match io::stdin().read_line(&mut guess) {
        Ok(_) => {
            println!("Your guess was {}", guess);
        },

        Err(e) => println!("Oops, something went wrong: {}", e)
    }

    let mut guess_length = 0;
    for _l in guess.chars() {
        guess_length = guess_length + 1;
    }

    guess_length = guess_length - 2; //When guess_length should = 0, guess_length = 2. Counteract with the subtraction.

    if guess_length != 6 {
        println!("Your guess must have 6 numbers with no spaces/letters. Eg: 123456");
        player_guess();
    }

    let mut counter = 0;
    for i in guess.chars() {
        if counter == 6 {
            break;
        }

        if !i.is_digit(10) {
            println!("Your guess must only contain numbers!");
            player_guess();
        }
        counter = counter + 1;
    }

    let mut guess_array: [u32; 6] = [0;6];

    let mut i = 0;

    for c in guess.chars() {

        if i == 6 {
            break;
        }

        let num = c.to_digit(10).unwrap();
        guess_array[i] = num;
        i = i + 1;
    }

    return guess_array;
}
