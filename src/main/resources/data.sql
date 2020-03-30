INSERT IGNORE INTO suppliers (contact_phone_number, name, supplier_number) VALUES
("641-646-7744", "Adex Ltd", "S01201"), /* id: 1 */
("641-646-7744", "Pualo Subsidiary", "S01202"),
("641-646-7744", "Emerald International Ltd", "S01203"), /* id: 1 */
("641-646-7744", "Emeka & Co. Ltd", "S01204");


INSERT IGNORE INTO products (product_number, name, quantity_in_stock, unit_price, supplier_supplier_id,date_supplied) VALUES
("000-061-0510", "Dongrin", 178, 3.34,1,"2020-01-23"), /* id: 1 */
("000-061-0511", "Emeka", 45, 2.54,2,"2007-01-23"), /* id: 2 */
("000-061-0512", "Ajayi", 678, 1.98,3,"1990-07-29"), /* id: 3 */
("000-061-0513", "Bill",  64, 3.69,1,"2020-01-23"), /* id: 4 */
("000-061-0514", "Barack", 869, 3.89, 2, "2001-08-12"), /* id: 5 */
("000-061-0515", "Bernie", 6435, 2.76, 1, "1980-01-15"); /* id: 6 */

-- INSERT IGNORE INTO students (student_number, is_international, first_name, last_name, middle_name, cgpa, classroom_id, transcript_id, enrollment_date) VALUES
-- ("000-061-0510", TRUE, "Don", "lacky", "Ron", 3.34,1,1,"2020-01-23"), /* id: 1 */
-- ("000-061-0511", TRUE, "Emeka", "Ihedioha", "Asisat", 2.54,2,2,"2007-01-23"), /* id: 2 */
-- ("000-061-0512", TRUE, "Ajayi", "Oloyun", "Simon", 1.98,1,3,"1990-07-29"), /* id: 3 */
-- ("000-061-0513", TRUE, "Bill", "Clinton", "Illinois", 3.69, 3, 4,"2020-01-23"), /* id: 4 */
-- ("000-061-0514", TRUE, "Barack", "Obama", "Jackson", 3.89, 2, 5,"2001-08-12"), /* id: 5 */
-- ("000-061-0515", TRUE, "Bernie", "Sanders", "Emmanuel", 2.76, 1,6,"1980-01-15"); /* id: 6 */
