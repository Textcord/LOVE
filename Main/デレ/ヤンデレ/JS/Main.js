const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});
console.log(`이름 : `)
rl.on("line", async function (line) {
    rl.close();
    const name = line;
    while (true) {
        console.log(`${name} 사랑해줘❤`);
        await new Promise((r) => setTimeout(r, 500));
        console.log(`${name} 사랑해줄래요?`);
        await new Promise((r) => setTimeout(r, 1000));
    }
})
