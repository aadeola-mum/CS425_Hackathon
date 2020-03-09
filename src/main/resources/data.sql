INSERT IGNORE INTO transcripts (degree_title) VALUES
("B.sc. Computer Science"), /* id: 1 */
("Msc. Computer Science"),
("B.sc. Computer Science"), /* id: 1 */
("Msc. Computer Science"),
("B.sc. Computer Science"), /* id: 1 */
("Msc. Computer Science");

INSERT IGNORE INTO classrooms (building_name, room_number) VALUES
("Dreier Building", "C213"), /* id: 1 */
("McLaughlin", "M105"), /* id: 2 */
("Verrill Hall", "38");

INSERT IGNORE INTO students (student_number, is_international, first_name, last_name, middle_name, cgpa, enrollment_date) VALUES
("000-061-0510", TRUE, "Don", "lacky", "Ron", 3.34,"2020-01-23"), /* id: 1 */
("000-061-0511", TRUE, "Emeka", "Ihedioha", "Asisat", 2.54,"2007-01-23"), /* id: 2 */
("000-061-0512", TRUE, "Ajayi", "Oloyun", "Simon", 1.98,"1990-07-29"), /* id: 3 */
("000-061-0513", TRUE, "Bill", "Clinton", "Illinois", 3.69,"2020-01-23"), /* id: 4 */
("000-061-0514", TRUE, "Barack", "Obama", "Jackson", 3.89, "2001-08-12"), /* id: 5 */
("000-061-0515", TRUE, "Bernie", "Sanders", "Emmanuel", 2.76, "1980-01-15"); /* id: 6 */

-- INSERT IGNORE INTO students (student_number, is_international, first_name, last_name, middle_name, cgpa, classroom_id, transcript_id, enrollment_date) VALUES
-- ("000-061-0510", TRUE, "Don", "lacky", "Ron", 3.34,1,1,"2020-01-23"), /* id: 1 */
-- ("000-061-0511", TRUE, "Emeka", "Ihedioha", "Asisat", 2.54,2,2,"2007-01-23"), /* id: 2 */
-- ("000-061-0512", TRUE, "Ajayi", "Oloyun", "Simon", 1.98,1,3,"1990-07-29"), /* id: 3 */
-- ("000-061-0513", TRUE, "Bill", "Clinton", "Illinois", 3.69, 3, 4,"2020-01-23"), /* id: 4 */
-- ("000-061-0514", TRUE, "Barack", "Obama", "Jackson", 3.89, 2, 5,"2001-08-12"), /* id: 5 */
-- ("000-061-0515", TRUE, "Bernie", "Sanders", "Emmanuel", 2.76, 1,6,"1980-01-15"); /* id: 6 */
