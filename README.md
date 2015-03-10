# ClojureScript Hello World

Simple Hello World app built with standalone ClojureScript JAR. Includes simple shell scripts for building the project.

### Usage
1. Clone this repo.
2. Copy the ClojureScript's JAR into the project folder.
3. Make the shell scripts executable (`chmod +x [filename]`).
4. Start hacking on the main cljs file: `src/hello_world/core.cljs`

### Shell scripts
- `build.sh`: builds the development version of the app in the `out/` folder.
- `watch.sh`: watch for the changes in the `src/` folder and rebuilds the development version as you go.
- `repl.sh`: starts the browser connected REPL and watches for changes.
- `release.sh`: builds production version of the app in `out/dist.js`
