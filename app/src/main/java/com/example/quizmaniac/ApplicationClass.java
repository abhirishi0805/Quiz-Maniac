package com.example.quizmaniac;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application
{
    public static ArrayList<Question> sports, gk, history, cinema, literature, science;

    @Override
    public void onCreate() {
        super.onCreate();

        sports = new ArrayList<>();
        gk = new ArrayList<>();
        history = new ArrayList<>();
        cinema = new ArrayList<>();
        literature = new ArrayList<>();
        science = new ArrayList<>();

        cinema.add(new Question("In the 1994 movie The Shawshank Redemption one of the lead male roles was played by?", "Tim Robbins", "Jack Robinson", "Elijah Wood", "Josh Hartnett", 'A'));
        cinema.add(new Question("In the 1972 movie The Godfather who played the Godfather?", "Robert Duvall", "James Caan", "Marlon Brando", "James Dean", 'C'));
        cinema.add(new Question("In the 1966 classic western The Good, the Bad and the Ugly, who played the key actor?", "Tom Felton", "Chuck Norris", "Clint Eastwood", "James Caan", 'C'));
        cinema.add(new Question("In the brilliant 2008 movie The Dark Knight who plays the bad guy The Joker?", "Michael Caine", "Maggie Gyllenhaal", "Heath Ledger", "Morgan Freeman", 'C'));
        cinema.add(new Question("In the 1999 movie Fight Club who acted the main role as schizophrenic office employee?", "Tom Felton", "Edward Norton", "Johny Depp", "Keanu Reeves", 'B'));
        cinema.add(new Question("In the 1942 movie Casablanca the lead female actress was?", "Jane Fonda", "Ginger Rogers", "Marilyn Monroe", "Ingrid Bergman", 'D'));
        cinema.add(new Question("In the 1981 movie Raiders of the Lost Ark who played lead female as Harrison Fords love interest?", "Emily Osment", "Jane Fonda", "Karen Allen", "Gwyneth Paltrow", 'C'));
        cinema.add(new Question("In the 1995 movie Se7en the lead female actress was?", "Jane Fonda", "Gwyneth Paltrow", "Emily Osment", "Demi Lovato", 'B'));
        cinema.add(new Question("Which movie is an Oscar winning movie i.e. Best Picture Winner in 2012 (in cinemas the previous year)?", "The Artist", "Hugo", "Moneyball", "The Girl with the Dragon Tattoo", 'A'));
        cinema.add(new Question("Which movie is an Oscar winning movie i.e. Best Picture Winner in 2009 (in cinemas the previous year)?", "Slumdog Millionaire", "The Curious Case of Benjamin Button", "Milk", "The Reader", 'A'));
        cinema.add(new Question("Who won the Oscar for Best Actor in 2008?", "Frank Langella", "Mickey Rourke", "Brad Pitt", "Sean Penn", 'D'));
        cinema.add(new Question("Who won the Oscar for Best Actor in 1999?", "Jeff Bridges", "Kevin Spacey", "Denzel Washington", "Russell Crowe", 'B'));
        cinema.add(new Question("Who won the Oscar for Best Actress in 2011?", "Meryl Streep", "Glenn Close", "Michelle Williams", "Viola Davis", 'A'));
        cinema.add(new Question("Who won the Oscar for Best Actress in 2005?", "Charlize Theron", "Felicity Huffman", "Reese Witherspoon", "Judi Dench", 'C'));
        cinema.add(new Question("The all-time best-selling album is called Thriller. By which artist was this?", "Madonna", "Tom Jones", "Michael Jackson", "Meat Loaf", 'C'));
        cinema.add(new Question("The Dark Side of the Moon is the second best selling album of all-time by which artist?", "AC/DC", "Eagles", "Pink Floyd", "The Partridge Family", 'C'));
        cinema.add(new Question("The 1980 album Back in Black was created by which band?", "Eagles", "AC/DC", "Led Zeppelin", "Shania Twain", 'B'));
        cinema.add(new Question("In 1997 an artist managed to secure their place in the hall of fame of all time with the album Come On Over. Who was this artist?", "Celine Dion", "Shania Twain", "Mariah Carey", "Backstreet Boys", 'B'));
        cinema.add(new Question("Which famous lady sang \"My Heart Will Go On\" in 1998?", "Mariah Carey", "Whitney Houston", "Celine Dion", "Adrianna Mie", 'C'));
        cinema.add(new Question("The song \"The House of the Rising Sun\" is rock classis performed by?", "Scott McKenzie", "Chic", "The Animals", "Modern Talking", 'C'));

        gk.add(new Question("Christ The Redeemer Statue on Corcovado Mountain is located in which country?", "China", "Canada", "Hungary", "Brazil", 'D'));
        gk.add(new Question("Iguazu Falls is located between which two countries?", "Argentina - Brazil", "China - Nepal", "India - Pakistan", "Poland - Germany", 'A'));
        gk.add(new Question("Angkor Wat Temple is located in which country?", "Bhutan", "Laos", "Vietnam", "Cambodia", 'D'));
        gk.add(new Question("Which world organization uses commonly the letters UNCTAD instead of its whole name?", "UN Conference on Trade And Development", "UN Conference on Trading And Deposits", "UN Chambers on Trading And Development", "UN Conference on Trade And Downpayments", 'A'));
        gk.add(new Question("What is the national currency of Albania?", "Sloty", "Lek", "Kwanza", "Ruble", 'B'));
        gk.add(new Question("What is the national currency of Germany?", "Euro", "Deutsche Mark", "German Mark", "German Franc", 'B'));
        gk.add(new Question("Who invented canning (airtight food preservation)?", "Nicolas Appert", "Oleg Antonov", "Hermann Ansch", "Genrich Altshuller", 'A'));
        gk.add(new Question("Who invented the magnifying glass?", "Roger Bacon", "Tim Lettuce", "Shawn Salt", "Brian Butter", 'A'));
        gk.add(new Question("Who invented the pH meter?", "Muhammad ibn Jabir al-Harrani al-Battani", "Francis Beaufort", "Ulugh Beg", "Arnold O. Beckman", 'D'));
        gk.add(new Question("Sulawesi is an island located in which country?", "Philippines", "Indonesia", "Japan", "Australia", 'B'));
        gk.add(new Question("The river Nile & Kagera don't run through one of these countries. Which one?", "Egypt", "Sudan", "Kenya", "Senegal", 'D'));
        gk.add(new Question("The river Mekong is a famous river in which continent?", "Africa", "Europe", "Asia", "South America", 'C'));
        gk.add(new Question("Ben Nevis is in which country?", "Scotland", "Canada", "Norway", "Holland", 'A'));
        gk.add(new Question("What is the capital of Andorra?", "Andorra la Violentina", "Andorra la Venizia", "Andorra la Vella", "Andorra la Vollopotto", 'C'));
        gk.add(new Question("The Caspian Sea is not neighboured by which of the countries?", "Kazakhstan", "Russia", "Turkey", "Iran", 'C'));
        gk.add(new Question("Lake Baikal is the deepest lake in the world. In which country is it?", "Canada", "Hungary", "Russia", "Mongolia", 'C'));
        gk.add(new Question("Zagreb is the capital of which country?", "Croatia", "Costa Rica", "Estonia", "Fiji", 'A'));
        gk.add(new Question("Helsinki is the capital of which country?", "France", "Honduras", "Finland", "Georgia", 'C'));
        gk.add(new Question("Where is the objective of \"Social Justice\" articulated in the Constitution of India?", "Article 14", "Article 16", "Article 15", "Preamble", 'C'));
        gk.add(new Question("World Health Day is observed on what day?", "June 5", "April 7", "June 7", "July 11", 'B'));

        science.add(new Question("The study of therapeutics is called?", "Aedoelogy", "Agonomy", "Aerdonetics", "Aceology", 'D'));
        science.add(new Question("What is the study of truth called?", "Alethiology", "Atmology", "Truthology", "Cethology", 'A'));
        science.add(new Question("Humans and chimpanzees share roughly how much DNA?", "86%", "98%", "73%", "92%", 'B'));
        science.add(new Question("Which metal is used by the jewellers to make gold and platinum ornaments heavier?", "Rhodium", "Iridium", "Erbium", "Thorium", 'B'));
        science.add(new Question("Choose the correct statement about Plasmonics.", "It is a chemical analysis of blood plasma.", "It is study of sound in a plasmonic medium.", "It deals with propagation, manipulation and localization of light at the nanoscale.", "It is the study of gaseous plasma in space.", 'C'));
        science.add(new Question("Which one of the following gases are released from the ground, minutes or hours before an earthquake is about to strike?", "Xenon", "Argon", "Helium", "Radon", 'D'));
        science.add(new Question("Which of the following is the first Indian State in the world where successful breeding of Western Tragopan has taken place?", "Assam", "Arunachal Pradesh", "Jammu and Kashmir", "Himachal Pradesh", 'D'));
        science.add(new Question("Which one of the following statement is correct about “PACMATE”?", "It is world’s fastest humanoid robot.", "It is world’s first mobile phone made for visually challenged.", "It is world’s first talking computer.", "It is a computer virus which crashed e-mail networks.", 'C'));
        science.add(new Question("For which one of the following diseases ICMR’s famous ‘Madras study’ was made?", "Tuberculosis", "Cancer", "Malaria", "AIDS", 'A'));
        science.add(new Question("What do you understand by Basal Metabolic Rate (BMR)?", "It is the calories that human body burns every day.", "It is the calories that human body burns while at rest.", "It is the calories a human body burns till the age of 5 years.", "It is the calories a human body burns in its life time.", 'B'));
        science.add(new Question("To prevent bacterial action which of the following substances is used in packaging of fruits?", "Ethyl bromide", "Methyl bromide", "Silver bromide", "Sodium bromide", 'B'));
        science.add(new Question("Rain sensors filted on the windshield wipers of some automobiles are based on which of the following principles?", "Surface tension", "Bernoulli’s principle", "Total internal reflection", "Heat radiation", 'C'));
        science.add(new Question("Which of the following statement is/are correct about asteroid '1998 OR2'?", "It has a diameter of 1.8-4.1 km.", "The closest approach would be on 29 April, 2020.", "It will stay 3.9 million miles away from our planet.\n", "All the above", 'D'));
        science.add(new Question("Which law suggested that there should be a planet between Mars and Jupiter?", "Bode's Law", "Planetary Law", "Celestial Law", "None of the above", 'A'));
        science.add(new Question("White Blood Cells are primarily divided into how many parts?", "Two", "Three", "Four", "Five", 'A'));
        science.add(new Question("Plasma Therapy is also known as", "Convular Plasma Therapy", "Convalescent Plasma Therapy", "Coviscule Plasma Therapy", "Functional Plasma Therapy", 'B'));
        science.add(new Question("Plasma Therapy was used first time in", "1870", "1890", "1896", "1899", 'B'));
        science.add(new Question("Name the process in which the liquid part of the blood or plasma is separated from the blood cells.", "Plasmametases", "Plasmaphorosioses", "Plasmapheresis", "None of the above", 'C'));
        science.add(new Question("Which mission of NASA brought first human to moon.", "Apollo program", "Gemini Program", "Mercury Program", "None of the above", 'A'));
        science.add(new Question("Name the first Spacecraft to visit the Solar System.", "Pioneer 10 and Pioneer 11", "Ranger 1 and Ranger 2", "Surveyor 6 and Surveyor 7", "Viking 1 and Viking 2", 'A'));

        history.add(new Question("Whose achievements are recorded in the Allahabad Pillar inscription?", "Chandragupta Maurya", "Samudra Gupta", "Vikramaditya", "Skand Gupta", 'B'));
        history.add(new Question("Who among the following Kushan Emperors was the first to introduce the gold coinage in India?", "Vima Kadphises", "Vima Taktu", "Vasishka", "Kujula Kadphises", 'A'));
        history.add(new Question("Which among the following is the oldest dynasty?", "Maurya", "Gupta", "Kushan", "Kanva", 'A'));
        history.add(new Question("Who was the patron king of Pataliputra Buddhist Council?", "Ajatashatru", "Kalashoka", "Ashoka", "Kanishka", 'C'));
        history.add(new Question("Which symbol shows renunciation?", "Lotus", "Bull", "Elephant", "Horse", 'D'));
        history.add(new Question("Which of the following inscriptions is found in purest Sanskrit?", "Ruminidei", "Junagarh", "Kalsi", "Patliputra", 'B'));
        history.add(new Question("How many Ganadharas were there in the religious family of Sambhavnath Tirthankar?", "95", "105", "115", "125", 'B'));
        history.add(new Question("Who was King Vipulvahan?", "Father of Sambhavnath", "Brother of Sambhavnath", "Friend of Sambhavnath", "Teacher of Sambhavnath", 'A'));
        history.add(new Question("Which of the following statement(s) is/are correct about Indian School of Philosophy?", "Jiva (a living being) is that state in which puruṣa is bonded to prakṛti in some form", "Purusha, also called atma, is immutable, eternal and conscious by its very nature", "Both A & B", "None of the above", 'C'));
        history.add(new Question("Which of the following is/are the key principle of Vishishtadvaita?", "Tattva", "Hita", "Purushartha", "All of the above", 'D'));
        history.add(new Question("What is meant by Mughalai?", "Infantry of the Mughals", "Very rich food", "Royal household", "Mughal territories from which Chauth was claimed", 'D'));
        history.add(new Question("Akbar's mausoleum is situated at", "Sasaram", "Sikandra", "Agra", "Delhi", 'B'));
        history.add(new Question("The Sikh gurus who compiled the Guru Granth Sahib was", "Nanak", "Har Rai", "Arjun", "Bahadur", 'C'));
        history.add(new Question("What the term ‘Bhakti’ refers to?", "Bhakti is derived from the root bhaj, which means divide", "Bhakti is derived from the root bhaj, which means collaboration", "Both A & B", "None of the above", 'A'));
        history.add(new Question("Chaitanya Mahaprabhu was an ascetic Hindu monk and social reformer in 16th century was from", "Bihar", "Assam", "Orissa", "Bengal", 'D'));
        history.add(new Question("Who among the following Mughal Emperors was half Rajput?", "Shah Jahan & Aurangzeb", "Akbar Jahan & Aurangzeb", "Shah Jahan & Jahangir", "Akbar Jahan & Humayun", 'C'));
        history.add(new Question("Which of the following is wrongly matched?", "Third Battle of Panipat: 1761", "Regulating Act: 1773", "Pitt’s India Act: 1761", "Treaty of Allahabad: 1765", 'C'));
        history.add(new Question("Who introduced the Subsidiary Alliance System in India?", "Lord Dalhousie", "Lord Ripan", "Lord Wellesley", "None of these", 'C'));
        history.add(new Question("Which of the following act of India ensured the partition of India?", "Government of India Act, 1909", "Government of India Act, 1919", "Government of India Act, 1935", "None of these", 'B'));
        history.add(new Question("Which of the following  provision was not included in the Nehru Report?", "India must be given Dominion status", "The Governor General must be only the constitutional head", "There was to be no separate electorate", "Diarchy should be introduced both at the centre as well as provinces", 'D'));

        literature.add(new Question("Who was the author of the famous storybook 'Alice's Adventures in Wonderland'?", "Rudyard Kipling", "John Keats", "Lewis Carroll", "H G Wells", 'C'));
        literature.add(new Question("Who wrote 'Where ignorance is bliss, it is folly to be wise'?", "Browning", "Marx", "Shakespeare", "Kipling", 'C'));
        literature.add(new Question("Name the book which opens with the line 'All children, except one grew up'.", "The Railway Children", "Winnie the Poo", "Jungle book", "Peter Pan", 'D'));
        literature.add(new Question("In which century were Geoffrey Chaucer's Canterbury Tales written?", "13th – 14th", "14th – 15th", "15th -16th", "16th – 17th", 'A'));
        literature.add(new Question("What was the nationality of Robert Louis Stevenson, writer of 'Treasure Island'?", "Scottish", "Welsh", "Irish", "French", 'A'));
        literature.add(new Question("What is the book 'Lord of the Flies' about?", "A round trip around the USA", "A swarm of killer flies", "Schoolboys on the desert island", "None of the above", 'C'));
        literature.add(new Question("In the book ‘the Lord of the Rings ‘, who or what is Bilbo?", "Dwarf", "Wizard", "Hobbit", "Troll", 'C'));
        literature.add(new Question("Don Quixote was written in which language?", "Old English", "Italian", "Spanish", "Greek", 'C'));
        literature.add(new Question("John Donne is known as a member of which school of poetry?", "Romanticism", "Jacobean", "Georgian", "Metaphysical", 'C'));
        literature.add(new Question("Sir Walter Scott is known for his historical novels about which country?", "Ireland", "Scotland", "Wales", "England", 'B'));
        literature.add(new Question("The Girl with the Dragoon Tattoo was originally published in which language?", "Swedish", "Norweigian", "Danish", "English", 'A'));
        literature.add(new Question("E.L. James’s Fifty Shades of Grey was originally fan fiction for which book series?", "The Twilight Series", "The Harry Potter Series", "The Outlander Series", "The Left Behind Series", 'B'));
        literature.add(new Question("Name That Author: This writer penned the Pulitzer Prize winning novel The Goldfinch.", "Elizabeth Strout", "Donna Tartt", "Anita Shreve", "Anne Patchett", 'B'));
        literature.add(new Question("The Invisible Man , a classic science fiction novel, was written by what author?", "Robert Louis Stevenson", "H.G. Wells", "Oscar Wilde", "Jules Vern", 'B'));
        literature.add(new Question("Who wrote the early science fiction work titled \"Voyage to the Moon\"?", "Francis Bacon", "Cyrano de Bergerac", "Rene Descartes", "William Shakespeare", 'C'));
        literature.add(new Question("Which one of the following was not one of The Three Musketeers?", "Aramis", "Athos", "Artagnan", "Porthos", 'C'));
        literature.add(new Question("Charles Dickens did not write which one of the following books?", "Barchester Towers", "Dombey and Son", "Great Expectations", "Hard Times", 'A'));
        literature.add(new Question("Where did the original Jezebel (shameless hussy) first appear?", "the Bible", "a Charles Dickens story", "a Shakespearean play", "a silent film", 'A'));
        literature.add(new Question("\"All is for the best in the best of all possible worlds\" is a line from what?", "Shakespeare's The Merchant of Venice", "Beckett's Waiting for Godot", "Voltaire's Candide", "None of the above", 'C'));
        literature.add(new Question("What kind of note are you writing when you write a \"bread-and-butter\" note?", "I'm sorry", "Thank you", "Convincing others", "We're moved", 'B'));

        sports.add(new Question("The Commonwealth Games started from which among the following countries?", "England", "Australia", "Canada", "India", 'C'));
        sports.add(new Question("WISPA is related to which of the following sports?", "Football", "Chess", "Cricket", "Squash", 'D'));
        sports.add(new Question("Which of the following stadiums in India was the first to Host a Test match in Independent India?", "Gymkhana Ground, Mumbai", "Feroz Shah Kotla, Delhi", "Eden Gardens, Kolkata", "M. A. Chidambaram Stadium, Chennai", 'B'));
        sports.add(new Question("Who among the following is the first batsman to hit six sixes in an over?", "Garfield Sobers", "Yuvraj Singh", "Ted Alletson", "Kapil Dev", 'A'));
        sports.add(new Question("Which among the following tournament is also known as World Team Championships for Women?", "Thomas Cup", "Uber cup", "Helvetia Cup", "Spanish Open Badminton", 'B'));
        sports.add(new Question("Who is the Chairperson of the IOC Women in Sport Commission?", "Lydia Nsekera", "Sam Ramsamy", "Mark Adams", "Larry Probst", 'A'));
        sports.add(new Question("Which country does Allyson Felix belong to?", "US", "Jamaica", "Kenya", "Nigeria", 'A'));
        sports.add(new Question("Which country had won the Men’s Hockey World Cup in 2018?", "India", "Australia", "Pakistan", "Germany", 'B'));
        sports.add(new Question("When was Thomas Cup founded?", "1926", "1938", "1949", "1957", 'C'));
        sports.add(new Question("How many chapters are there in the Olympic Charter?", "5", "6", "7", "8", 'A'));
        sports.add(new Question("Who was the winner of Pole Vault in 2018 Diamond League for men?", "Brandon Starc", "Sam Kendricks", "Timur Morgunov", "Christian Taylor", 'C'));
        sports.add(new Question("When was the Olympic flag created?", "1912", "1914", "1915", "1913", 'D'));
        sports.add(new Question("Which of the following terms are used to describe parts of a cricket bat?", "Eye and Toe", "Leg and Hand", "Shoulders and Toe", "Neck and Shoulders", 'C'));
        sports.add(new Question("Which is the governing body Chess in the world?", "World Chess Federation", "World Chess Association", "World Chess Organisation", "Association of World Chess Champions", 'A'));
        sports.add(new Question("Who are the Women’s Doubles World No. 1 player pair as per the BWF World Rankings?", "Yuki Fukushima and Sayaka Hirota", "Misaki Matsutomo and Ayaka Takahashi", "Mayu Matsumoto and Wakana Nagahara", "Greysia Polii and Apriyani Rahayu", 'A'));
        sports.add(new Question("When was the first time the Commonwealth Games were held in Asia?", "1994", "1998", "1990", "1986", 'A'));
        sports.add(new Question("Who is the Vice-Patron of the Commonwealth Games Federation?", "Queen Elizabeth II", "Prince Charles", "Duke of Edinburgh", "HRH The Earl of Wessex", 'D'));
        sports.add(new Question("Which team bagged the Fair Play Award in 2018 FIFA World Cup?", "France", "Croatia", "Spain", "Italy", 'C'));
        sports.add(new Question("Which is the International governing body for the sport of Amateur Wrestling?", "International Wrestling Federation", "United World Wrestling", "World Amateur Wrestling Federation", "Wrestling Organization of the World", 'B'));
        sports.add(new Question("After whose name is the domestic cricket championship Ranji Trophy named?", "Maharaja Ranjit Singh", "Maharaja Bhupinder Singh", "Maharaja Jam Saheb", "None of the above", 'C'));

    }
}
